package Mock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import DAO.Airplane;
import DAO.AirplaneDao;
import elasticSearch.ElasticClient;

public class AirplaneDaoImpl implements AirplaneDao {

	@Override
	public String addElement(Airplane e) throws Exception {
		ElasticClient.makeConnection();
		Map<String, Object> data = ConvertClass.objectToJson(e);
		IndexRequest indexRequest = new IndexRequest("index_airplane", "airplane").source(data);
		IndexResponse response = null;
		try {
			response = ElasticClient.restHighLevelClient.index(indexRequest);
		} catch (ElasticsearchException exp) {
			exp.getDetailedMessage();
		} catch (java.io.IOException exp) {
			exp.getLocalizedMessage();
		}
		ElasticClient.closeConnection();
		if (response != null) {
			return response.toString();
		}
		return "no-response";
	}

	@Override
	public Airplane modifyElement(String id, Airplane element) throws Exception {
		ElasticClient.makeConnection();
		UpdateRequest updateRequest = new UpdateRequest("index_airplane", "airplane", id).fetchSource(true);
		Map<String, Object> airport = ConvertClass.objectToJson(element);
		updateRequest.doc(airport);
		UpdateResponse updateResponse = ElasticClient.restHighLevelClient.update(updateRequest);
		ElasticClient.closeConnection();
		return (Airplane) ConvertClass.jsonToObject(updateResponse.getGetResult().getSource(), "Airplane");
	}

	@Override
	public boolean deleteElement(Airplane e) throws Exception {
		return false;
	}

	@Override
	public boolean deleteElement(String id) {
		ElasticClient.makeConnection();
		DeleteRequest deletePilotRequest = new DeleteRequest("index_airplane", "airplane", id);
		DeleteResponse deleteResponse = null;
		try {
			deleteResponse = ElasticClient.restHighLevelClient.delete(deletePilotRequest);
			if (deleteResponse.getResult().toString().equals("DELETED")) {
				System.out.println(deleteResponse.getResult().toString());
				ElasticClient.closeConnection();
				return true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			ElasticClient.closeConnection();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public List<Airplane> consultElement() throws Exception {

		ElasticClient.makeConnection();
		SearchRequest searchRequest = new SearchRequest("index_airplane");
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.query(QueryBuilders.matchAllQuery());
		searchRequest.source(searchSourceBuilder);
		SearchResponse searchResponse = ElasticClient.restHighLevelClient.search(searchRequest);
		SearchHit[] searchHit = searchResponse.getHits().getHits();

		List<Airplane> airplanes = new ArrayList<Airplane>();

		if (searchHit.length > 0) {
			Arrays.stream(searchHit).forEach(hit -> {
				try {
					airplanes.add((Airplane) ConvertClass.jsonToObject(hit.getSourceAsMap(), "Airplane"));
				} catch (JsonParseException e) {
					e.printStackTrace();
				} catch (JsonMappingException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
		ElasticClient.closeConnection();
		return airplanes;
	}

	@Override
	public Airplane searchPlane(int id) throws Exception {
		ElasticClient.makeConnection();
		SearchRequest searchRequest = new SearchRequest("index_airplane");
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.query(QueryBuilders.matchQuery(field, value));
		searchRequest.source(searchSourceBuilder);
		SearchResponse searchResponse = ElasticClient.restHighLevelClient.search(searchRequest);
		SearchHit[] searchHit = searchResponse.getHits().getHits();

		List<Airplane> airplanes = new ArrayList<Airplane>();

		if (searchHit.length > 0) {
			Arrays.stream(searchHit).forEach(hit -> {
				try {
					airplanes.add((Airplane) ConvertClass.jsonToObject(hit.getSourceAsMap(), "Airplane"));
				} catch (JsonParseException e) {
					e.printStackTrace();
				} catch (JsonMappingException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
		ElasticClient.closeConnection();
		return airplanes;
	}

	@Override
	public List<Airplane> searchPlane(String model) throws Exception {
		ElasticClient.makeConnection();
		SearchRequest searchRequest = new SearchRequest("index_airplane");
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.query(QueryBuilders.matchQuery("model", model));
		searchRequest.source(searchSourceBuilder);
		SearchResponse searchResponse = ElasticClient.restHighLevelClient.search(searchRequest);
		SearchHit[] searchHit = searchResponse.getHits().getHits();

		List<Airplane> airplanes = new ArrayList<Airplane>();

		if (searchHit.length > 0) {
			Arrays.stream(searchHit).forEach(hit -> {
				try {
					airplanes.add((Airplane) ConvertClass.jsonToObject(hit.getSourceAsMap(), "Airplane"));
				} catch (JsonParseException e) {
					e.printStackTrace();
				} catch (JsonMappingException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
		ElasticClient.closeConnection();
		return airplanes;
	}

}
