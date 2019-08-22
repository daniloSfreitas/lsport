package br.com.lsport.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

@Configuration
@EnableMongoRepositories
public class MongoConfiguration extends AbstractMongoConfiguration {

	@Override
	public MongoClient mongoClient() {
		MongoClientURI uri = new MongoClientURI(
			    "mongodb+srv://root:root@cluster0-kosd5.mongodb.net/test?retryWrites=true&w=majority");

			MongoClient mongoClient = new MongoClient(uri);
			MongoDatabase database = mongoClient.getDatabase("LSPORT");
		return mongoClient;
	}

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "LSPORT";
	}

}
