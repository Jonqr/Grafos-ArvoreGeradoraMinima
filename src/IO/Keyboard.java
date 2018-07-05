package IO;


import java.io.*;
import java.util.*;

public class Keyboard
{

private static InputStreamReader is = new InputStreamReader( System.in );

private static BufferedReader br = new BufferedReader( is );

private static StringTokenizer st;

private static String nt;

private static boolean debug = false;


private static StringTokenizer getToken() throws IOException, NullPointerException 
 {
 String s = br.readLine();
 return new StringTokenizer(s);
 } // fim do método getToken


public static boolean readBoolean() 
 {
 return readBoolean(true);
 }

public static boolean readBoolean(boolean defaultvalue) 
 {
 try 
   {
   st = getToken(); // pega os tokens a partir da linha lida
   nt = st.nextToken(); // e a primeira string do token.
   // Retorna true se a string for igual a...
   if (nt.equalsIgnoreCase("true") ||        // true
       nt.equalsIgnoreCase("t") ||           // t
       nt.equalsIgnoreCase("yes") ||         // yes
       nt.equalsIgnoreCase("y") ||           // y
       nt.equalsIgnoreCase("on") ||          // on
       nt.equalsIgnoreCase("v") ||           // v
       nt.equalsIgnoreCase("s") ||           // s
       nt.equalsIgnoreCase("sim") ||         // sim
       nt.equalsIgnoreCase("verdadeiro"))    // verdadeiro
       return true; 
   // Retorna false se a string for igual a...
   else if (nt.equalsIgnoreCase("false") ||  // false
            nt.equalsIgnoreCase("f") ||      // f
            nt.equalsIgnoreCase("no") ||     // no
            nt.equalsIgnoreCase("n") ||      // n
            nt.equalsIgnoreCase("off") ||    // off
            nt.equalsIgnoreCase("nao") ||    // nao
            nt.equalsIgnoreCase("não") ||    // não
            nt.equalsIgnoreCase("falso"))    // falso
       return false; 
   // Se não for nenhum dos valores reconhecidos, retorna o default
   else return defaultvalue;
   }
 catch (IOException ioe) // se houver algum erro de leitura
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de entrada e saída lendo um boolean. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 catch (NoSuchElementException nsee) // se não houver tokens
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Entrada não contém um boolean. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 } // fim do método readBoolean


public static byte readByte() 
 {
 return readByte((byte)0);
 } // fim do método readByte

public static byte readByte(byte defaultvalue) 
 {
 try 
   {
   st = getToken(); // pega os tokens a partir da linha lida
   nt = st.nextToken(); // e a primeira string do token.
   // retorna o valor processado pela classe Byte
   return Byte.parseByte(nt);
   }
 catch (IOException ioe) // se houver algum erro de leitura
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de entrada e saída lendo um byte. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 catch (NumberFormatException nfe) // se houver algum erro de conversão
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de conversão de "+nt+" para um byte. "+
                        "Retorna "+defaultvalue);
   return defaultvalue;
   }
 catch (NoSuchElementException nsee) // se não houver tokens
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Entrada não contém um byte. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 } // fim do método readByte


public static short readShort() 
 {
 return readShort((short)0);
 } // fim do método readShort


public static short readShort(short defaultvalue) 
 {
 try 
   {
   st = getToken(); // pega os tokens a partir da linha lida
   nt = st.nextToken(); // e a primeira string do token.
   // retorna o valor processado pela classe Short
   return Short.parseShort(nt);
   }
 catch (IOException ioe) // se houver algum erro de leitura
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de entrada e saída lendo um short. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 catch (NumberFormatException nfe) // se houver algum erro de conversão
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de conversão de "+nt+" para um short. "+
                        "Retorna "+defaultvalue);
   return defaultvalue;
   }
 catch (NoSuchElementException nsee) // se não houver tokens
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Entrada não contém um short. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 } // fim do método readShort


public static int readInt() 
 {
 return readInt(0);
 } // fim do método readInt

public static int readInt(int defaultvalue) 
 {
 try 
   {
   st = getToken(); // pega os tokens a partir da linha lida
   nt = st.nextToken(); // e a primeira string do token.
   // retorna o valor processado pela classe Integer
   return Integer.parseInt(nt);
   }
 catch (IOException ioe) // se houver algum erro de leitura
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de entrada e saída lendo um int. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 catch (NumberFormatException nfe) // se houver algum erro de conversão
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de conversão de "+nt+" para um int. "+
                        "Retorna "+defaultvalue);
   return defaultvalue;
   }
 catch (NoSuchElementException nsee) // se não houver tokens
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Entrada não contém um int. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 } // fim do método readInt


public static long readLong() 
 {
 return readLong(0l);
 } // fim do método readLong

public static long readLong(long defaultvalue) 
 {
 try 
   {
   st = getToken(); // pega os tokens a partir da linha lida
   nt = st.nextToken(); // e a primeira string do token.
   // retorna o valor processado pela classe Long
   return Long.parseLong(nt);
   }
 catch (IOException ioe) // se houver algum erro de leitura
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de entrada e saída lendo um long. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 catch (NumberFormatException nfe) // se houver algum erro de conversão
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de conversão de "+nt+" para um long. "+
                        "Retorna "+defaultvalue);
   return defaultvalue;
   }
 catch (NoSuchElementException nsee) // se não houver tokens
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Entrada não contém um long. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 } // fim do método readLong


public static float readFloat() 
 {
 return readFloat(0f);
 } // fim do método readFloat

public static float readFloat(float defaultvalue) 
 {
 try 
   {
   st = getToken(); // pega os tokens a partir da linha lida
   nt = st.nextToken(); // e a primeira string do token.
   // Verifica se o valor é aparentemente NaN ou infinito
   if (nt.toLowerCase().startsWith("nan")) return Float.NaN;
   else if (nt.toLowerCase().startsWith("inf")) return Float.POSITIVE_INFINITY;
   else if (nt.toLowerCase().startsWith("+inf")) return Float.POSITIVE_INFINITY;
   else if (nt.toLowerCase().startsWith("-inf")) return Float.NEGATIVE_INFINITY;
   // Retorna o valor processado pela classe Float
   else return Float.parseFloat(nt);
   }
 catch (IOException ioe) // se houver algum erro de leitura
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de entrada e saída lendo um float. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 catch (NumberFormatException nfe) // se houver algum erro de conversão
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de conversão de "+nt+" para um float. "+
                        "Retorna "+defaultvalue);
   return defaultvalue;
   }
 catch (NoSuchElementException nsee) // se não houver tokens
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Entrada não contém um float. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 } // fim do método readFloat


public static double readDouble() 
 {
 return readDouble(0.0);
 } // fim do método readDouble

public static double readDouble(double defaultvalue) 
 {
 try 
   {
   st = getToken(); // pega os tokens a partir da linha lida
   nt = st.nextToken(); // e a primeira string do token.
   // Verifica se o valor é aparentemente NaN ou infinito
   if (nt.toLowerCase().startsWith("nan")) return Double.NaN;
   else if (nt.toLowerCase().startsWith("inf")) return Double.POSITIVE_INFINITY;
   else if (nt.toLowerCase().startsWith("+inf")) return Double.POSITIVE_INFINITY;
   else if (nt.toLowerCase().startsWith("-inf")) return Double.NEGATIVE_INFINITY;
   // Retorna o valor processado pela classe Double
   return Double.parseDouble(nt);
   }
 catch (IOException ioe) // se houver algum erro de leitura
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de entrada e saída lendo um double. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 catch (NumberFormatException nfe) // se houver algum erro de conversão
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de conversão de "+nt+" para um double. "+
                        "Retorna "+defaultvalue);
   return defaultvalue;
   }
 catch (NoSuchElementException nsee) // se não houver tokens
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Entrada não contém um double. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 } // fim do método readDouble

public static char readChar() 
 {
 return readChar(' ');
 } // fim do método readChar

public static char readChar(char defaultvalue) 
 {
 try 
   {
   st = getToken(); // pega os tokens a partir da linha lida
   nt = st.nextToken(); // e a primeira string do token.
   // retorna o primeiro caractere da string acima
   return nt.charAt(0);
   }
 catch (IOException ioe) // se houver algum erro de leitura
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de entrada e saída lendo um char. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 catch (NoSuchElementException nsee) // se não houver tokens
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Entrada não contém um char. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 } // fim do método readChar

public static String readString() 
 {
 return readString("");
 } // fim do método readString

public static String readString(String defaultvalue) 
 {
 try 
   {
   nt = br.readLine(); // uma string lida diretamente 
   if (nt.trim().length() == 0) // nada foi entrado, então
     return defaultvalue; // retorna o valor default
   else return nt; // retorna o que foi lido
   }
 catch (IOException ioe) // se houver algum erro de leitura
   {
   if (debug) // se for pedida a impressão de mensagens de erro
     System.err.println("KEYBOARD:: Erro de entrada e saída lendo uma string. "+
                        "Retorna "+defaultvalue);
   return defaultvalue; // retorna o valor default
   }
 } // fim do método readString

public static void debugOn() 
 {
 debug = true;
 System.err.println("KEYBOARD:: Mostrando mensagens de erro e avisos...");
 } // fim do método debugOn

public static void debugOff() 
 {
 debug = false;
 } // fim do método debugOff

} // fim da classe Keyboard
