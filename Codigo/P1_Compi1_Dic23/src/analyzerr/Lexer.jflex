    // ------------  Paquete e importaciones ------------
package analyzerr; 

import java_cup.runtime.*;
import clases.Erroor;
import clases.Token;
import function.funca;
import static function.funca.TokenList;
import static function.funca.ErrorList;

%%	
//-------> Directivas (No tocar)

%public 
%class Lexer
%cup
%char
%column
%line
%unicode
%ignorecase

%{ 
%} 
 
// ------> Expresiones Regulares 


//comentariomulti = <![\s\S]*!>
comentariomulti =[<][!][^!]*[!]+([^>*][^!]*[*]+)*[>]
comentariolinea =\/\/[^\n]*
erchar =\'[a-zA-ZñÑ]\'
caracterSoloLetra = [a-zA-Z]
caracterSoloNumero = [0-9]
identificador = [a-zA-Z][a-zA-Z0-9_]+
entero = "[0-9]{2,}"
decimal =([0-9]+\.[0-9]+|[0-9]+)
cadena = [\"][^\"\n]*[\"]
caracterEspecialUnico = [\x21-\x2F\x3A-\x40\x5B-\x60\x7B-\x7D]









//    [/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]     
//    /\\*[^*]*\\*+(?:[^/*][^*]*\\*+)*/
//    /\\*\\s*([^*]|(\\*+[^*/]))*\\*+\\s*\\*/
//    \/\*[\s\S]*?\*\/

%%
// ------------  Reglas Lexicas -------------------


// --> Palabras Reservadas = 1 
"conj"                   {Token NuevoToken = new Token("TkCONJ_R",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkCONJ_R> Tk: "  + yytext());return new Symbol(sym.TkCONJ_R, yycolumn, yyline, yytext()); }


// --> Simbolos = 16
";"     {Token NuevoToken = new Token("TkPUNTOYCOMA",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkPUNTOYCOMA> Tk: " + yytext());return new Symbol(sym.TkPUNTOYCOMA, yycolumn, yyline, yytext());}
":"     {Token NuevoToken = new Token("TkDOSPUNTOS",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkDOSPUNTOS> Tk: " + yytext());return new Symbol(sym.TkDOSPUNTOS, yycolumn, yyline, yytext());}
","     {Token NuevoToken = new Token("TkCOMA",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkCOMA> Tk: " + yytext());return new Symbol(sym.TkCOMA, yycolumn, yyline, yytext());}
"{"     {Token NuevoToken = new Token("TkLLAVEA",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkLLAVEA> Tk: " + yytext());return new Symbol(sym.TkLLAVEA, yycolumn, yyline, yytext());}
"}"     {Token NuevoToken = new Token("TkLLAVEC",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkLLAVEC> Tk: " + yytext());return new Symbol(sym.TkLLAVEC, yycolumn, yyline, yytext()); }
"("     {Token NuevoToken = new Token("TkPARENTESISAbre",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkPARENTESISAbre> Tk: " + yytext());return new Symbol(sym.TkPARENTESISAbre, yycolumn, yyline, yytext());}
")"     {Token NuevoToken = new Token("TkPARENTESISCierra",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkPARENTESISCierra> Tk: " + yytext());return new Symbol(sym.TkPARENTESISCierra, yycolumn, yyline, yytext());}
"->"    {Token NuevoToken = new Token("TkDelimitador",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkDelimitador> Tk: " + yytext());return new Symbol(sym.TkDelimitador, yycolumn, yyline, yytext()); }
//"*"     {Token NuevoToken = new Token("TkCerraduraKleen",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkCerraduraKleen> Tk: " + yytext());return new Symbol(sym.TkCerraduraKleen, yycolumn, yyline, yytext()); }
//"|"     {Token NuevoToken = new Token("TkOr",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkOr> Tk: " + yytext());return new Symbol(sym.TkOr, yycolumn, yyline, yytext()); }
//"+"     {Token NuevoToken = new Token("TkMas",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkMas> Tk: " + yytext());return new Symbol(sym.TkMas, yycolumn, yyline, yytext()); }
//"?"     {Token NuevoToken = new Token("TkInterrogacion",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkInterrogacion> Tk: " + yytext());return new Symbol(sym.TkInterrogacion, yycolumn, yyline, yytext()); }
//"."     {Token NuevoToken = new Token("TkConcatenacion",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkConcatenacion> Tk: " + yytext());return new Symbol(sym.TkConcatenacion, yycolumn, yyline, yytext());}
"~"     {Token NuevoToken = new Token("TkGuionCurseado",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkGuionCurseado> Tk: " + yytext());return new Symbol(sym.TkGuionCurseado, yycolumn, yyline, yytext());}
//"-"     {Token NuevoToken = new Token("TkGuionNormal",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkGuionNormal> Tk: " + yytext());return new Symbol(sym.TkGuionNormal, yycolumn, yyline, yytext());}
//"_"     {Token NuevoToken = new Token("TkGuionBajo",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkGuionBajo> Tk: " + yytext());return new Symbol(sym.TkGuionBajo, yycolumn, yyline, yytext());}





// --> ER = 8
{comentariomulti}           {}
{comentariolinea}           {}
{caracterSoloNumero}                    {Token NuevoToken = new Token("TkENTERO",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkENTERO> Tk: " + yytext());return new Symbol(sym.TkENTERO, yycolumn, yyline, yytext()); }
{decimal}                   {Token NuevoToken = new Token("TkDECIMAL",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkDECIMAL> Tk: " + yytext());return new Symbol(sym.TkDECIMAL, yycolumn, yyline, yytext());}
{cadena}                    {Token NuevoToken = new Token("TkCADENA",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkCADENA> Tk: " + yytext());return new Symbol(sym.TkCADENA, yycolumn, yyline, yytext());}
{erchar}                    {Token NuevoToken = new Token("TkErChar",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkErChar> Tk: " + yytext());return new Symbol(sym.TkErChar, yycolumn, yyline, yytext());}
{caracterSoloLetra}         {Token NuevoToken = new Token("TkICaracter",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkICaracter> Tk: " + yytext());return new Symbol(sym.TkICaracter, yycolumn, yyline, yytext());}
{caracterEspecialUnico}     {Token NuevoToken = new Token("TkICaracterEspecial",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkICaracterEspecial> Tk: " + yytext());return new Symbol(sym.TkICaracterEspecial, yycolumn, yyline, yytext());}
{identificador}             {Token NuevoToken = new Token("TkIdentificador",yytext(),yyline,yycolumn);TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkIdentificador> Tk: " + yytext());return new Symbol(sym.TkIdentificador, yycolumn, yyline, yytext());}



comentario {}

//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{Erroor errorsito = new Erroor("Lexico", yytext() ,"No es válido en este lenguaje", yyline, yycolumn);ErrorList.add(errorsito);System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }