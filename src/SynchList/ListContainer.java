package SynchList;

import java.util.ArrayList;
import java.util.List;

public class ListContainer
{
  private List<Integer> integerList;

  public ListContainer()
  {
    this.integerList = new ArrayList<>();
  }

  public synchronized void add(int integer){
    integerList.add(integer);
  }

  public synchronized int getLength(){
    return integerList.size();
  }
}
