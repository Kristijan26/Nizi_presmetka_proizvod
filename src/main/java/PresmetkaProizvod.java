import java.util.Scanner;
public class PresmetkaProizvod {
public static void main(String[] args) {
Scanner input = new Scanner (System.in); // Креирање на објект од класата Scanner за внес од тастатура
System.out.println("Presmetaj go i ispecati go proizvodot na clenovite vo nizata"); // Испис на порака за корисникот
System.out.print("Vcitaj broj na clenovi vo niza "); // Испис на порака за корисникот
int n = input.nextInt(); // Вчитување на цел број од тастатура
int niza[] = new int[n]; // Креирање на низа со внесениот број на елементи
System.out.println("Vcitaj clenovi vo niza:"); // Испис на порака за корисникот
for (int i = 0; i < niza.length; i++) { // Циклус за вчитување на елементите од низата
System.out.print(i + "-->"); // Испис на порака за корисникот
niza[i] = input.nextInt(); // Вчитување на елементите од низата од тастатура
}
double p=1; // Иницијализација на променливата p
for(int i=0;i < niza.length;i++){ // Циклус за множење на елементите од низата
p=p*niza[i]; // Израчунување на производот на елементите од низата
}
System.out.println("p="+p); // Испис на резултатот
}
}