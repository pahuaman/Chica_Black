#include <iostream>
#include <sstream>
#include <windows.h>

using namespace std;

inline void Limpia_Pantalla(){ Sleep(500); system("cls"); } //funcion para limpiar la pantalla

class Chica
{
public:
    void Nombre();
    void Caracteres1();
    void Caracteres2();
    void Menu();
};

void Chica :: Nombre()
{
    Sleep(500);
    cout<<"\t\t\t  LURDEZ BLACK"<<endl;
}//funcion para imprimir el nombre

void Chica :: Caracteres1()
{
    char a = 3, b = 4;
    Sleep(500);
    cout<<"\t\t\t"<<a;
    Sleep(500);
    cout<<"\t\t"<<b<<endl;

}//funcion para los primeros caracteres

void Chica :: Caracteres2()
{
    char c = 5, d = 6;
    Sleep(500);
    cout<<"\t\t\t"<<c;
    Sleep(500);
    cout<<"\t\t"<<d<<endl;

}//funcion para los primeros caracteres

void Chica :: Menu()
{
    char e = 1, f = 2;

    cout<<" "<<endl;
    Sleep(500);
    cout<<"\t\t\tQUE VOY A HACER CONTIGO? "<<endl;
    cout<<" "<<endl;
    Sleep(500);
    cout<<"\t\t\t1. NADA "<<endl;
    Sleep(500);
    cout<<"\t\t\t2. MATARTE "<<endl;
    cout<<" "<<endl;
    Sleep(500);
    cout<<"\t\t\tELIGE UNA OPCION "<<endl;
    cout<<" "<<endl;
    cout<<"\t\t\t"<<e<<" "<<f<<" "<<e<<" "<<f<<" "<<e<<" "<<f<<" "<<e<<" "<<f<<" "<<e<<endl;
}//funcion con cosillas XD

int main()
{
    Chica Black;
    system("color C");

    while(true)
    {
        Black.Caracteres1();
        Black.Nombre();
        Black.Caracteres2();
        Black.Menu();
        Limpia_Pantalla();
    }//while
    return 0;
}//main
