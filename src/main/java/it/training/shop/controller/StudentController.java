package it.training.shop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import it.training.shop.model.StudentModel;
import it.training.shop.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/1")
	public ResponseEntity<StudentModel> home() {
		
		StudentModel model = new StudentModel();
		
		model.setStdId("31014");
		model.setName("Somsak");
		model.setSurname("rukdee");
		model.setAge(18);
		
		return ResponseEntity.ok(model);
	}
	
	
	@GetMapping("/2")
	public ResponseEntity<StudentModel[]> student2(){
		
		StudentModel[] modelArray = new StudentModel[3];
		
		modelArray[0] = new StudentModel();
		modelArray[0].setStdId("31010");
		modelArray[0].setName("Somsak");
		modelArray[0].setSurname("Rukdee");
		modelArray[0].setAge(18);
		
		modelArray[1] = new StudentModel();
		modelArray[1].setStdId("31011");
		modelArray[1].setName("SomChai");
		modelArray[1].setSurname("Jaidee");
		modelArray[1].setAge(17);
		
		modelArray[2] = new StudentModel();
		modelArray[2].setStdId("31012");
		modelArray[2].setName("SomPong");
		modelArray[2].setSurname("deejai");
		modelArray[2].setAge(19);
		
		return ResponseEntity.ok(modelArray);
	}
	
	
	@GetMapping("/3")
	public ResponseEntity<List<StudentModel>> student3(){
		
			List<StudentModel> modelList = new ArrayList<StudentModel>();
		
			StudentModel model = new StudentModel();
			model.setStdId("31010");
			model.setName("Sompong");
			model.setSurname("Jaidee");
			model.setAge(16);
			modelList.add(model);
			
			model = new StudentModel();
			model.setStdId("31011");
			model.setName("Somruk");
			model.setSurname("Kamsing");
			model.setAge(19);
			modelList.add(model);
			
			
		
		return ResponseEntity.ok(modelList);
	}
	
	
	
	@PostMapping("/4")
	public ResponseEntity<StudentModel> student4(@RequestBody StudentModel std) {
		
		StudentModel result = std;
		
		int newAge = std.getAge() + 5;
		String newName = "Mr."+std.getName();
		
		result.setAge(newAge);
		result.setName(newName);
		
		
		return ResponseEntity.ok(result);
	}
	
	
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<StudentModel>> getAll(){
		List<StudentModel> result = studentService.getAllStudents();
		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addStd(@RequestBody StudentModel student){
		studentService.addStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}
	
	
	
	
	
	
	
}
