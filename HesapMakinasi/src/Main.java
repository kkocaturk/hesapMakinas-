
import java.util.Scanner;

        public class Main {

            static void topla() {
                System.out.println("Toplama işlemi 0 rakamı girene kadar devam edecek!");
                Scanner klavye = new Scanner(System.in);
                int sayi, toplam = 0, i = 1;
                    while (true) {
                        System.out.print(i++ + ". sayı :");
                        sayi = klavye.nextInt();
                            if (sayi == 0) {
                                break;
                            }
                        toplam += sayi;
                    }
                System.out.println("Sonuç : " + toplam);
            }

            static void cikar() {
                Scanner klavye = new Scanner(System.in);
                System.out.print("Toplam kaç adet sayı gireceksiniz :");
                int sayac = klavye.nextInt();
                System.out.println("İlk girilen sayıdan diğerleri çıkarılacak");
                int sayi, sonuc = 0;

                for (int i = 1; i <= sayac; i++) {

                    if(i==1) {
                        System.out.print(i + ".   sayı :");
                        }
                   if(i!=1) {
                       System.out.print((i-1) + ".  çıkacak sayı :");
                   }
                    sayi = klavye.nextInt();
                    if (i == 1) {
                        sonuc += sayi;
                        continue;
                    }
                    sonuc -= sayi;
                }

                System.out.println("Sonuç : " + sonuc);
            }

            static void carp() {
                System.out.println("1 değeri girilinceye kadar çarpma devam edecek!" );
                Scanner klavye = new Scanner(System.in);
                int sayi, sonuc = 1, i = 1;

                while (true) {
                    System.out.print(i++ + ". sayı :");
                    sayi = klavye.nextInt();

                    if (sayi == 1)
                        break;

                    if (sayi == 0) {
                        sonuc = 0;
                        break;
                    }
                    sonuc *= sayi;
                }

                System.out.println("Sonuç : " + sonuc);
            }

            static void bol() {
                System.out.println("İlk girilen sayı diğer sayılara bölünecek");
                Scanner klavye = new Scanner(System.in);
                System.out.print("Kaç adet sayı gireceksiniz :");
                int sayac = klavye.nextInt();
                double sayi, sonuc = 0.0;

                for (int i = 1; i <= sayac; i++) {
                    if(i==1){
                        System.out.print( "Bölünecek sayı :");
                    }
                    if(i!=1) {
                        System.out.print((i-1) + ". bölen :");
                    }
                    sayi = klavye.nextDouble();
                    if (i != 1 && sayi == 0) {
                        System.out.println("Böleni 0 giremezsiniz.");
                        continue;
                    }
                    if (i == 1) {
                        sonuc = sayi;
                        continue;
                    }
                    sonuc /= sayi;
                }

                System.out.println("Sonuç : " + sonuc);
            }

            static void us() {
                Scanner klavye = new Scanner(System.in);
                System.out.print("Taban değeri giriniz :");
                int taban = klavye.nextInt();
                System.out.print("Üs değeri giriniz :");
                int us = klavye.nextInt();
                int sonuc = 1;

                for (int i = 1; i <= us; i++) {
                    sonuc *= taban;
                }

                System.out.println("Sonuç : " + sonuc);
            }


            public static void main(String[] args) {

                Scanner klavye = new Scanner(System.in);
                int secim;
                String menu = "1- Toplama İşlemi\n"
                        + "2- Çıkarma İşlemi\n"
                        + "3- Çarpma İşlemi\n"
                        + "4- Bölme işlemi\n"
                        + "5- Üslü Sayı Hesaplama\n"
                        + "0- Çıkış Yap";

                do {
                    System.out.println(menu);
                    System.out.print("Lütfen bir işlem seçiniz :");
                    secim = klavye.nextInt();
                    switch (secim) {
                        case 1:
                            topla();
                            break;
                        case 2:
                            cikar();
                            break;
                        case 3:
                            carp();
                            break;
                        case 4:
                            bol();
                            break;
                        case 5:
                            us();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
                    }
                } while (secim != 0);

            }

        }


