import java.util.ArrayList;
import java.util.List;

public class Bibliotheque<T> {
    private List<T> element;

    public Bibliotheque() {

        this.element = new ArrayList<T>();
    }
    public Bibliotheque(List<T> element) throws InvalidTailleException{
        if(element.size() >10) throw new InvalidTailleException();
        this.element = element;
    }
    public List<T> getElement() {
        return element;
    }
    public void setElement(List<T> element) throws InvalidTailleException {
        if (element.size() > 10)  throw new InvalidTailleException();
        else this.element = element;
    }
    public void addElement(T element) throws InvalidTailleException {
        if (getElement().size() > 10)  throw new InvalidTailleException();
        else this.element.add(element);
    }
    public void removeElement(T element) {
        this.element.remove(element);
    }
    public int size() {
        return this.element.size();
    }
    public void affiche() {
        for(T element : this.element) {
            System.out.println(element);
        }
    }

}
