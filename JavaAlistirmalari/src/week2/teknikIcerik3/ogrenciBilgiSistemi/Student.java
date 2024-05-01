package week2.teknikIcerik3.ogrenciBilgiSistemi;
// Degiskenelerin tanimlanmasi
public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    double fizikOrtalama;
    double kimyaOrtalama;
    double matOrtalama;

    // Yapici fonksiyonlar
    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    // Girilen notlarin 0 ile 100 arasinda olmasi icin kontrol ve degerlerin girilmesi
    public void addBulkExamNote(int mat, int fizik, int kimya , int matSozlu , int fizikSozlu , int kimyaSozlu) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
            this.mat.sozluNote = matSozlu;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
            this.fizik.sozluNote = fizikSozlu;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
            this.kimya.sozluNote = kimyaSozlu;
        }

    }

    // Notlarının girilip girilmedigi ve ortalamanin ekrana yazdirilmasi
    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    //Ortalama hesaplanmasi
    public void calcAvarage() {
        fizikOrtalama = (this.fizik.note * 0.80 ) + (this.fizik.sozluNote * 0.20);
        kimyaOrtalama = (this.kimya.note * 0.80 ) + (this.kimya.sozluNote * 0.20);
        matOrtalama = (this.mat.note * 0.80 ) + (this.mat.sozluNote * 0.20);

        this.avarage = (fizikOrtalama+ kimyaOrtalama+ matOrtalama) / 3;

    }

    // Gecti mi Kaldi mi kontrolü
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }
    // Ekrana yazdirma islemi yapildi.
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Yazılı Notu : " + this.mat.note + " -- Matematik Sözlü Not : " + this.mat.sozluNote + " Matematik Ortalaamsı : " + matOrtalama);
        System.out.println("Fizik Yazılı Notu : " + this.fizik.note + " -- Fizik Sözlü Not : " + this.fizik.sozluNote + " Fizik Ortalaması : " + fizikOrtalama);
        System.out.println("Kimya Yazılı Notu : " + this.kimya.note + " -- Kimya Sözlü Not : " + this.kimya.sozluNote + " Kimya Ortalaması : " + kimyaOrtalama);

    }

}