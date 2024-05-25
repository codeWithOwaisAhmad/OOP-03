
public class Main {
  public static void main(String[] args) {
      Student Harry = new Student();
      Student Alex = new Student();
      Harry.setName("Harry");
      Harry.setFatherName("Peter");
      Harry.setCourse("Computer Science");
      Harry.setDepartment("Computing");
      Harry.setFee(60625.0);
      Harry.setPercentage(88.8);
      Harry.setRollNo(1091);
      Harry.setRoomNo(1.56);
      Harry.setSemester(2);
      Harry.setStudying(true);
//        System.out.println(Alex.getName());
//        System.out.println(Alex.getFatherName());
//        System.out.println(Alex.getCourse());
//        System.out.println(Alex.getFee());
//        System.out.println(Alex.getDepartment());
//        System.out.println(Alex.getPercentage());
//        System.out.println(Alex.getRollNo());
//        System.out.println(Alex.getRoomNo());
//        System.out.println(Alex.getSemester());
//        System.out.println(Alex.getStudying());
      Alex.setName("Alex");
      Alex.setFatherName("Robin");
      Alex.setCourse("Artificial Intelligence");
      Alex.setDepartment("Computing");
      Alex.setFee(53850.0);
      Alex.setPercentage(79.8);
      Alex.setRollNo(1204);
      Alex.setRoomNo(2.23);
      Alex.setSemester(4);
      Alex.setStudying(false);
//        System.out.println(Alex.getName());
//        System.out.println(Alex.getFatherName());
//        System.out.println(Alex.getCourse());
//        System.out.println(Alex.getFee());
//        System.out.println(Alex.getDepartment());
//        System.out.println(Alex.getPercentage());
//        System.out.println(Alex.getRollNo());
//        System.out.println(Alex.getRoomNo());
//        System.out.println(Alex.getSemester());
//        System.out.println(Alex.getStudying());
      Alex.showAllDetails();
      Harry.showAllDetails();
  }
}