//# Задача об Индиане Джонсе:
//# Индиана Джонс - нестандартный человек с духом неистребимого авантюризма. Он пошел в магазин за продуктами.
//# Решив себя побаловать, Индиана Джонс покупает набор продуктов,
//# который полностью заполнит стандартный пакет из магазина, вместимостью 20 кг. (переменная 'v'),
//# выбирая самые дорогие продукты из ассортимента
//# (переменная 'a', где a[0] - объем (кг) каждого продукта, a[1] - общая стоимость (руб) каждого продукта).
//# Напишите код, который рассчитает стоимость покупки общим объемом v,
//# чтобы общая ценность (руб.) этого набора была максимальной.
//
//a = 1[[6, 12], 2[5, 2], 3[2, 10], 4[10, 100], 5[4, 12], 6[18, 9], 7[38, 720]]
//v = 20
//        1:2    2,5:1   1:5        1:10       1:3      2:1     1:18,95
class Main {
    public static void main(String[] args) {


//v=a41*2=20    sum=a42*2=200
int sum=0;  // itogovaya summa
int v=0; // paket
int a11=6;  // v
 int a12=12;  // sum
int a21=5;  // v
 int a22=2;  // sum
int a31=2;  // v
 int a32=10;  // sum
int a41=10;  // v
 int a42=100;  // sum
int a51=4;  // v
 int a52=12;  // sum
int a61=18;  // v
 int a62=9;  // sum
int a71=38;  // v
 int a72=720;  // sum
int x=0; //
int y=0; //
int z=0; //
int l1=0;
int m1=0;
int l2=0;
int m2=0;
z= a11/a12;
x=z;
y=z;
l1=a11;
m1=a12;
l2=0;
m2=0;
if (a21/a22 & a22<20) { if (a21/a22<x){ x= a21/a32; l1=a21; m1=a22; else y=a21/a22; l2=a21; m2=a22}
else x=z;};
if (a31/a32 & a32<20) { if (a31/a32<x){ x= a31/a32; l1=a31; m1=a32; else if (a31/a32<y) {y=a31/a32; l2=a31; m2=a32; else y=y;}}
else x=x;};
if (a41/a42 & a42<20) { if (a41/a42<x){ x= a41/a42; l1=a41; m1=a42; else if (a41/a42<y) {y=a41/a42; l2=a41; m2=a42; else y=y;}}
else x=x;};
if (a51/a52 & a52<20) { if (a51/a52<x){ x= a51/a52; l1=a51; m1=a52; else if (a51/a52<y) {y=a51/a52; l2=a51; m2=a52; else  y=y;}}
else x=x;};
if (a61/a62 & a62<20) { if (a61/a62<x){ x= a61/a62; l1=a61; m1=a62; else if (a61/a62<y) {y=a61/a62; l2=a61; m2=a62; else y=y;}}
else x=x;};
if (a71/a72 & a72<20) { if (a71/a72<x){ x= a71/a72; l1=a71; m1=a72; else if (a71/a72<y) {y=a71/a72; l2=a71; m2=a72; else y=y;}}
else x=x;};
//имея переменные x и y, мы можем вычислить максимальную сумму покупок
//v=a41*2=20    sum=a42*2=200 ---эталонное решение, при пересчете вручную
	if (x<y) { do{ sum=sum+m1; v=v+l1; }while (v=20);
	else do { sum=sum+m2; v=v+l2; } while (v=20);



System.out.println("Итоговая стоимость покупок составила", sum);}}
