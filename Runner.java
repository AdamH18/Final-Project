import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public class Runner{
  public static void main(String[]args){
    Path dataPath = Paths.get("Data", "Pokemon.txt");
    try{
      List<String> pokemon = Files.readAllLines(dataPath, StandardCharsets.US_ASCII);
      pokemon.remove(0);
      PickWindow wind = new PickWindow(pokemon);
    } catch(IOException e){
      System.out.println(e);
    }
  }
}