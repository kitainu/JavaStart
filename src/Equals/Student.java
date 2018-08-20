package Equals;

public class Student {
    String firstName;
    String lastName;

   public Student(String fn, String ln){
       firstName = fn;
       lastName= ln;
   }

    @Override
    public String toString() {
        return "Student{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }
//
}
//@Override
//    public boolean equals(Object obj) {
//       //sprawdzenie równości fizycznej za pomocą ==
//       if(this == obj)
//           return true;
//       //sprawdzamy czy nie null
//       if(obj==null)
//           return false;
//       //sprawdzamy czy przekazany argument jest typu student
//       if(!(obj instanceof Student))
//           return false;
//       //rzutowanie na odpowiedni typ
//        Student s = (Student) obj;
//          // sprawdzenie kolejnych pól klasy uważając na wartości null
//        if(this.firstName == s.firstName && this.lastName == s.lastName)
//            return true;
//        if(this.firstName !=null){
//            if(!this.firstName.equals(s.firstName))
//                return false;
//        }else if(this.firstName==null&&s.firstName!=null)
//            return false;
//        if (lastName != null) {
//            if(!this.lastName.equals(s.lastName))
//                return false;
//        }else if(this.lastName==null&&s.lastName!=null)
//                return false;
//        return true;
//    }