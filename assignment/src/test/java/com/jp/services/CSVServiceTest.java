package com.jp.services;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.fileUpload;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.apache.commons.csv.*;

import org.springframework.data.jpa.repository.JpaRepository;

@RunWith(SpringRunner.class)
public class CSVServiceTest {
	
	@Test
	public void testCsvLoad() throws IOException{
		//read file from resources
		Path rootPath = Paths.get("/Users/vandanhatkar/Documents/workspace-sts-3.9.6.RELEASE/assignment/src/main/resources/data/");
		List<Path> csvFilePaths = Files.walk(rootPath.toAbsolutePath()).filter(Files::isRegularFile).collect(Collectors.toList());
		
		csvFilePaths.forEach(x->{
			BufferedReader bf =Files.newBufferedReader(x);
		});
		
		
		
		
		
		
		CSVParser cs = new CSVParser();
		
	}

}
