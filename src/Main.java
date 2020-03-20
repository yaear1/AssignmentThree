import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HW3 { 
  public static void main(String[] args) { 
    HW3 obj = new HW3();
    obj.s();
    
  }
  
  public String[] s() {
     
    String csvFile = "C:/Users/USER/Desktop/ml-latest-small";
    BufferedReader br = null; 
    String line = " ";
    String csvSplitBy = "," + "(" + ")";
   
    try { 
      
      br = new BufferedReader(new FileReader(csvFile));
      while ((line = br.readLine()) != null) { 
        
        //use comma as separator 
        String[] movies = line.split(csvSplitBy);
        ;
        
      }
    } catch (FileNotFoundException e) { 
      e.printStackTrace();
    } catch (IOException e) { 
      e.printStackTrace();
    } finally { 
      if (br != null) { 
        try { 
          br.close();
        } catch (IOException e) { 
          e.printStackTrace();
        }
      }
    }
    return movies;
  }
  
  public class Movie {
  private String title;
  private int releaseYear;
  Movie left, right; 
  
  Movie(String t, int r){
    title = t;
    releaseYear = r;
    left = right = null;
  }
  
}
  public class MovieBST {
  private Movie first = new Movie(movies[0], movies[1]);
    
  public void add(){
    
    for(int i = 2; i < movies.length; i+= 2) {  
    
    if(movies[i].compareTo(first.title) > 0){
      Movie n = new Movie(movies[i], movies[i+1]);
    first.right = n;
  
    } else { 
      first.left = n;
    }
  }
  }
  public void subSet(String start, String end){
    
    while(start != end.right) {
    System.out.println(start.title);
    subSet(start);
    }
  }
  
    public Movie subSet(String start) { 
     return start.right;
    }
    
    
    
  }
    public Node search(Node root, string key) 
{ 
    // Base Cases: root is null or key is present at root 
    if (root==null || root.title == key) 
        return root; 
  
    
    if (root.title.compareTo(key) < 0) 
        return search(root.left, key); 
  
    // val is less than root's key 
    return search(root.right, key); 
    // Selects movie titles that fall alphabetically between start and end.
  }

  // more methods

}
