package PlayDataPreCourse.sec11_ClassObject.exam03;

public class FieldInitValueExample {
    public static void main(String[] args) {
        FieldInitValue fiv = new FieldInitValue();

        System.out.println("fiv.byteField = " + fiv.byteField);
        System.out.println("fiv.shortField = " + fiv.shortField);
        System.out.println("fiv.intField = " + fiv.intField);
        System.out.println("fiv.longField = " + fiv.longField);
        
        System.out.println("fiv.booleanField = " + fiv.booleanField);
        System.out.println("fiv.charField = " + fiv.charField);
        
        System.out.println("fiv.floatField = " + fiv.floatField);
        System.out.println("fiv.doubleField = " + fiv.doubleField);
        
        System.out.println("fiv.arrField = " + fiv.arrField);
        System.out.println("fiv.referenceField = " + fiv.referenceField);
    }

    /*
        fiv.byteField = 0
        fiv.shortField = 0
        fiv.intField = 0
        fiv.longField = 0
        fiv.booleanField = false
        fiv.charField =
        fiv.floatField = 0.0
        fiv.doubleField = 0.0
        fiv.arrField = null
        fiv.referenceField = null
    */
}
