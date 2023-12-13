{
// CONJUNTOS
CONJ: letra -> a~z;
CONJ: letraMayus -> A~Z;
CONJ: digito -> 0-9;
CONJ: bool -> 0,1;
CONJ: op -> *~/;

//expresiones
nombre -> +..(letraMayus)*(letra)_;
int -> ..int;
float-> ...(digito)*(digito)".".(digito)*(digito);
entero->.(digito)*(digito);
binario-> .(bool)*(bool);
compi -> ....compi1;
binfloat ->...(bool)*(bool)".".(bool)*(bool);
or ->||.c1.c2.c3;

}