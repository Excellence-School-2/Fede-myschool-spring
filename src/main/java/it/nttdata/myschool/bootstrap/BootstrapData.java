package it.nttdata.myschool.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.nttdata.myschool.entity.SchoolClass;
import it.nttdata.myschool.entity.Student;
import it.nttdata.myschool.repository.ClassRepository;
import it.nttdata.myschool.repository.StudentRepository;




@Component
public class BootstrapData implements CommandLineRunner {

   private final StudentRepository studentRepository;
   private final ClassRepository classRepository;

   
   public BootstrapData(StudentRepository studentRepository,ClassRepository classRepository){
      this.classRepository=classRepository;
      this.studentRepository=studentRepository;
      
   }




    @Override
    public void run(String... args) throws Exception {
        
        
         SchoolClass schoolClass=new SchoolClass("1A");
         SchoolClass schoolClass2=new SchoolClass("2A");
         SchoolClass schoolClass3=new SchoolClass("3A");



         Student student=new Student("Alba", "Birri", 13);
         Student student2=new Student("Brigida", "Astra", 11);
         Student student3=new Student("Alda", "Caldo", 12);
         Student student4=new Student("Carla", "Freddo", 10);
         Student student5=new Student("Era", "Bianchi", 11);
         Student student6=new Student("Irma", "Bisma", 13);

           student.setSchoolClass(schoolClass);
           student5.setSchoolClass(schoolClass2);
           student2.setSchoolClass(schoolClass);
           student3.setSchoolClass(schoolClass2);
           student4.setSchoolClass(schoolClass3);
           student6.setSchoolClass(schoolClass3);

           classRepository.save(schoolClass);
           classRepository.save(schoolClass2);
           classRepository.save(schoolClass3);


           studentRepository.save(student);
           studentRepository.save(student2);
           studentRepository.save(student3);
           studentRepository.save(student4);
           studentRepository.save(student5);
           studentRepository.save(student6);




















    }
    
}
