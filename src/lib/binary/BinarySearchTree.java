package lib.binary;

/**
 *
 * @author Ayesha
 * 
 */

class Binary {
 
  public Node root;

  public Binary insert(Book value) {
    Node node = new Node<>(value);

    if (root == null) {
      root = node;
      return this;
    }

    insertRec(root, node);
    return this;
  }

  private void insertRec(Node latestRoot, Node node) {

    if (latestRoot.value.getId() > node.value.getId()) {

      if (latestRoot.left == null) {
        latestRoot.left = node;
        return;
      } else {
        insertRec(latestRoot.left, node);
      }
    } else {
      if (latestRoot.right == null) {
        latestRoot.right = node;
        return;
      } else {
        insertRec(latestRoot.right, node);
      }
    }
  }

  public Book findBookByISBN(String ISBN){
    if (root == null) {
      return null;
    }
    Node node = root;
    while (root != null) {
       if (ISBN.compareTo(node.value.getIsbn()) == 0)
       {
                return node.value;
       }else if (ISBN.compareTo(node.value.getIsbn()) < 0){
                node = node.left;
       }else if (ISBN.compareTo(node.value.getIsbn()) > 0){
                node = node.right;
       }
    }
      return null;
  }
 
  public Book findBookByTitle(String title){
    if (root == null) {
      return null;
    }
    Node node = root;
    while (root != null) {
       if (title.compareTo(node.value.getTitle()) == 0)
       {
                return node.value;
       }else if (title.compareTo(node.value.getTitle()) < 0){
                node = node.left;
       }else if (title.compareTo(node.value.getTitle()) > 0){
                node = node.right;
       }
    }
      return null;
  }
  
  public void removeByISBN(String ISBN) {    
      root.right = removeBookByISBN(ISBN, root );
      System.out.println(root.value.getTitle()+"  Book Deleted : ");
  } 
 

  public void printInorder() {
    printInOrderRec(root);
    System.out.println("");
  }

  private void printInOrderRec(Node currRoot) {
    if (currRoot == null) {
      return;
    }
    printInOrderRec(currRoot.left);
    System.out.print(currRoot.value.getIsbn() + ", "); 
    printInOrderRec(currRoot.right);
  }

  public void printPreorder() {
    printPreOrderRec(root);
    System.out.println("");
  }

  private void printPreOrderRec(Node currRoot) {
    if (currRoot == null) {
      return;
    }
    System.out.print(currRoot.value.getIsbn() + ", ");
    printPreOrderRec(currRoot.left);
    printPreOrderRec(currRoot.right);
  }

  public void printPostorder() {
    printPostOrderRec(root);
    System.out.println("");
  }

  private void printPostOrderRec(Node currRoot) {
    if (currRoot == null) {
      return;
    }
    printPostOrderRec(currRoot.left);
    printPostOrderRec(currRoot.right);
   // System.out.print("ISBN IS : "+currRoot.value.getIsbn()+ " And Title IS : "+currRoot.value.getTitle()+" ,\n ");
  }

    private Node removeBookByISBN(String ISBN, Node root) {
         if (root == null) { 
            return null;    
        }    
        if (ISBN.compareTo(root.value.getIsbn()) == 0) {   
            if (root.left == null) {   
                return root.right;    
            } else if (root.right == null) {    
                return root.left;    
            } else {    
                root.value.setIsbn(getRightmost(root.left)); 
                root.left = removeBookByISBN(root.value.getIsbn(), root.left);  
            }    
        } else {     
            if (ISBN.compareTo(root.value.getIsbn()) < 0) { 
                root.left = removeBookByISBN(ISBN, root.left);    
            } else {  
                try {
                    root.right = removeBookByISBN(ISBN, root.right); 
                } catch (Exception e) {
                    
                }
                   
            }    
        }    
        return root;    
    }
    
    protected String getRightmost(Node node) {    
        assert (node != null);    
        Node right = node.right;    
        if (right == null) {    
            return root.value.getIsbn();    
        } else {    
            return getRightmost(right);    
        }    
    } 
}

public class BinarySearchTree {

  public static void main(String[] args) {
   /* These record added for testing ....
      
    Binary bst = new Binary();
    Book newBook = new Book();
    newBook.setId(2);
    newBook.setTitle("Test 01");
    newBook.setIsbn("IT20014");
  
    Book newBook2 = new Book();
    newBook2.setId(4);
    newBook2.setTitle("Test 02");
    newBook2.setIsbn("IT20034");
    
    bst .insert(newBook);
    bst.insert(newBook2);
    bst.insert(new Book(8,"Test 03","","IT20085","",""));
            
    
    System.out.println("Inorder traversal");
    bst.printInorder();

    System.out.println("Preorder Traversal");
    bst.printPreorder();

    System.out.println("Postorder Traversal");
    bst.printPostorder();

    System.out.println("Book Searched : " + bst.findBookByISBN("IT20085").getTitle());
    
    bst.removeByISBN("IT20034");
      
    */
  }
}


 class Node<T> {
     
  public Book value;

  public Node left;

  public Node right;

  public Book getBook(){
      return value;
  }
  
  public Node(Book value) {
    this.value = value;
  }

}
