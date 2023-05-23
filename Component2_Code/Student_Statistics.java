import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class Student_Statistics {
    private String name;
    private String id;
    private String[] courses;

    public Student_Statistics(String name, String id, String courses)
    {
     //Data of student in file
        this.name = name;
        this.id = id;
        this.courses = courses.split(",");
    }

  
    public static void main(String[] args) {
        
        ArrayList<Student_Statistics> students = new ArrayList<Student_Statistics>();

         Student_Statistics student=null;
         try {
             //Here we will Read from file  which we add Data of students in it
            String line=null;
            FileReader fileReader = new FileReader("data//Registration_DataBase.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
				
                String[] parts = line.split(";");
                students.add(new Student_Statistics(parts[0],parts[1],parts[2]));
            }
            bufferedReader.close();
            } catch (IOException error) {
               System.out.println("Not Exist The File Registration_DataBase Because that file should be make using the service1");
            }
   
        HashMap<String, Integer> courseCounts = new HashMap<>();

        //Count the courses in each registered Student.
        for (Student_Statistics oneStudent : students) {
            for(String str : oneStudent.courses){
                if (courseCounts.containsKey(str)) {
                    courseCounts.put(str, courseCounts.get(str) + 1);
                } else {
                    courseCounts.put(str, 1);
                }
            }
        }

        System.out.println("The Component2 Output Statistics\n");
        //Print the Courses Count
        System.out.println("Number of users: " + students.size());
        courseCounts.keySet().forEach(course -> {
            System.out.println("Number of students registered "+course+" course: " + courseCounts.get(course));
        });
        
        //Print the Number of batch files: 4 Number of verified batch files: 2
        //the folder that is mount
        File dataFolder = new File("data//batch");
        File[] eligibleFiles = dataFolder.listFiles((dir, name) -> name.contains("verified"));
        File[] allFiles = dataFolder.listFiles();
        System.out.println("The Number of batch files: "+(allFiles.length));
        System.out.println("Number of verified batch files: "+eligibleFiles.length);
   
    }
}
