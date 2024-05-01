package week2.teknikIcerik3.ogrenciBilgiSistemi;


public class OgrenciBilgiSistemi {
    public static void main(String[] args) {

        // Nesneler olusturuldu.
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mücahit Kaya ", "90550000000", "MAT");
        Teacher t2 = new Teacher("Yiğit DİNÇER", "90550000001", "FZK");
        Teacher t3 = new Teacher("Adem SAKA", "90550000002", "KMY");

        //ogretmen ekleme fonksiyonu cagrildi
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        // Ogrenci nesnesi olusturuldu ve degerler atandi.
        Student s1 = new Student("Emrullah Akkuş", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40 , 55 ,60,80);
        s1.isPass();

        Student s2 = new Student("Yakup ERMURAT", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40 ,65,75,50);
        s2.isPass();

        Student s3 = new Student("Hakan UTEŞ", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40 ,65,35,45);
        s3.isPass();

    }
}