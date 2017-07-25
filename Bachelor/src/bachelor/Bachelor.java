package bachelor;
/**
 *
 * @author Eugene Vereshchagin (g7skim)
 */
public class Bachelor extends Student {

    @Override
    void study (){System.out.println("Can earn a degree in four years");}
    
    public static void main(String[] args) {
        Student s1 = new Bachelor ();//upcasting
        s1.univ();
        s1.study();
    }
    
}
