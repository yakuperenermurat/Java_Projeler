package week2.teknikIcerik3.ogrenciBilgiSistemi;

// Degiskenlerin tanimlanmasi
public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNote;
    //Yapici fonksiyon
    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    //Ogretmen ekleme fonksiyonu
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    //ogretmen yazdırma fonksiyonu
    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}