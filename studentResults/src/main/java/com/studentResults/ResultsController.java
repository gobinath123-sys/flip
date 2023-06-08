package com.studentResults;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ResultsController {
	@Autowired
	RestTemplate rt;
	
	@Autowired
	ResultsService rs;
	
	
	
	
	@PostMapping("/setResults")
	public String setResults(@RequestBody ResultsEntity res) {
		return rs.setResults(res);
	}

	@GetMapping("/getFinalMarks")
	public List<ResultsEntity> getFinalMarks() {
		return rs.getFinalMarks();
	}

	@GetMapping("/getFinalMarkByRoll/{roll}")
	public ResultsEntity getFinalMarkByRoll(@PathVariable int roll) {
		return rs.getFinalMarkByRoll(roll);
	}

	@GetMapping("/getTotalByRoll/{roll}")
	public int getTotalByRoll(@PathVariable int roll) {
		return rs.getTotalByRoll(roll);
	}

	@PutMapping("/updateByRoll/{roll}")
	public String updateByRoll(@RequestBody ResultsEntity a, @PathVariable int roll) {
		return rs.updateByRoll(a, roll);
	}
	


	@DeleteMapping("/deleteByid/{id}")
	public String deleteByid(@PathVariable int id) {
		return rs.deleteByid(id);
	}
	


	// Post in DataBase
	@PostMapping("/findResults")
	public String findResults() {
		String url1 = "http://localhost:8082/setStudent";
		ResponseEntity<List<Student>> studentResponse = rt.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Student>>() {
				});
		List<Student> stDet = studentResponse.getBody();
		List<ResultsEntity> resultsDetails = new ArrayList<>();
		
		for (Student x : stDet) {
			String url2 = "http://localhost:8081/setMark";
			ResponseEntity<MarkSheet> markResponse = rt.exchange(url2 + x.getRollNumber(), HttpMethod.GET, null,
					new ParameterizedTypeReference<MarkSheet>() {});
			MarkSheet marksheet = markResponse.getBody();
			int id=x.getId();
			int rollNumber = x.getRollNumber();
			String name = x.getName();
			int overAll = marksheet.getSem1Total() + marksheet.getSem2Total();
			int total = overAll / 2;
			int percentage = total;
			if (x.getAttendance() > 90) {
				total += 5;
				percentage = total;
				if (total > 100) {
					total = 100;
				}
			}
			ResultsEntity resu = new ResultsEntity();
			resu.setRollNumber(rollNumber);
			resu.setName(name);
			resu.setTotalMarks(total);
			resu.setPercentage(percentage);
			resultsDetails.add(resu);
			resultsDetails.add(resu);
		}
		return rs.findResults(resultsDetails); 
	}
	
	@GetMapping("/getThreeToppers")
	public List<ResultsEntity> getThreeToppers() {
		String url1 = "http://localhost:8080/getFinalMarks";
		ResponseEntity<List<ResultsEntity>> resultsResponse = rt.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<ResultsEntity>>() {
				});
		List<ResultsEntity> allRes = resultsResponse.getBody();

		List<ResultsEntity> topThree = allRes.stream()
				.sorted(Comparator.comparing(ResultsEntity::getTotalMarks).reversed()).limit(3)
				.collect(Collectors.toList());

		return topThree;
	}

	@GetMapping("/getStudentsByRange/{a}/{b}")
	public List<ResultsEntity> getStudentsByRange(@PathVariable int a, @PathVariable int b) {
		String url1 = "http://localhost:8080/getFinalMarks";
		ResponseEntity<List<ResultsEntity>> resultsResponse = rt.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<ResultsEntity>>() {
				});
		List<ResultsEntity> allRes = resultsResponse.getBody();
		

		List<ResultsEntity> byRange = allRes.stream().filter(x -> x.getTotalMarks() > a && x.getTotalMarks() < b)
				.collect(Collectors.toList());

	
		return byRange;
	}
	
	@GetMapping("/getTopper")
	public ResultsEntity getTopper() {
		String url1 = "http://localhost:8080/getFinalMarks";
		ResponseEntity<List<ResultsEntity>> resultsResponse = rt.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<ResultsEntity>>() {
				});
		List<ResultsEntity> allRes = resultsResponse.getBody();

		ResultsEntity topper = allRes.stream().max(Comparator.comparing(ResultsEntity::getTotalMarks)).get();
		return topper;

	}
	

	
	

	
	
	@GetMapping(value = "/getStudent")
	public List<Student> getStudent() {
		String url1 = "http://localhost:8082/getStudent";
	ResponseEntity<List<Student>> studentResponse = rt.exchange(url1, HttpMethod.GET, null,
			new ParameterizedTypeReference<List<Student>>() {
			});
	List<Student> stDet = studentResponse.getBody();
	
	return stDet;
	}

	@GetMapping(value = "/getMarks")
	public List<MarkSheet> getMarks() {
		String url = "http://localhost:8081/getMarkAll";

		ResponseEntity<List<MarkSheet>> response1 = rt.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<MarkSheet>>() {
				});

		List<MarkSheet> res = response1.getBody();
		return res;
	}
	
	
}
