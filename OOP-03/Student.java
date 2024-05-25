public class Student {
  private String name;
  private int rollNo;
  private double percentage;
  private double fee;
  private String department;
  private String fatherName;
  private int semester;
  private String course;
  private boolean isStudying;
  private double roomNo;
  public String  getName(){
      return name;
  }
  public void setName(String name){
      this.name = name;
  }
  public int getRollNo(){
      return rollNo;
  }
  public void setRollNo(int rollNo){
      if (rollNo > 0) {
          this.rollNo = rollNo;
      }else {
          System.out.println("Invalid RollNumber");
      }
  }
  public double getPercentage(){
      return percentage;
  }
  public void setPercentage(double percentage){
     this.percentage = percentage;
  }
  public double getFee(){
      return fee;
  }
  public void setFee(double fee){
      this.fee = fee;
  }
  public String getDepartment(){
      return department;
  }

  public void setDepartment(String department) {
      this.department = department;
  }

  public String getFatherName(){
      return fatherName;
  }
  public void setFatherName(String fatherName){
      this.fatherName = fatherName;
  }

  public int getSemester(){
      return semester;
  }
  public void setSemester(int semester){
      this.semester = semester;
  }
  public String getCourse(){
      return course;
  }
  public  void setCourse(String course){
      this.course = course;
  }
  public boolean getStudying(){
      return isStudying;
  }
  public void setStudying(boolean isStudying){
      this.isStudying = isStudying;
  }
  public double getRoomNo(){
      return roomNo;
  }
  public void setRoomNo(double roomNo){
      this.roomNo = roomNo;
  }
  Student(){

  }
  void showAllDetails(){
      System.out.println("Student name is: " + name);
      System.out.println("Student RollNo is: " + rollNo);
      System.out.println("Student Percentage is: " + percentage);
      System.out.println("Student Fee is: " + fee);
      System.out.println("Student Department is: " + department);
      System.out.println("Student Course is: " + course);
      System.out.println("Student RoomNo is: " + roomNo);
      System.out.println("Student Father is: " + fatherName);
      System.out.println("Student RollNo is: " + rollNo);
      System.out.println("Student is Studying: " + isStudying);
      System.out.println("Student semester is: " + semester);
  }
}
