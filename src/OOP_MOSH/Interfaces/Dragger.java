package OOP_MOSH.Interfaces;

public class Dragger {
  public void drag(UIWidget draggable) {
    draggable.drag();
    System.out.println("Dragging done!");
  }
}
