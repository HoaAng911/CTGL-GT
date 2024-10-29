package LinkedList;

public class Mylinkedlist {
    public static class Node {
        // Khoi tao gia tri value va next
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void printLinkedlist(Node head) {
        // neu heal == null tuc la list rong
        if (head == null) {
            System.out.println("List is empty");
        } else {
            // nguoc lai dung bien tam de in ra gia tri cua list
            // tao mot node tam
            Node temp = head;
            // check node tam != null thi in ra gia tri bien tam o do
            while (temp != null) {
                // vong lap in gia tri cua list
                System.out.print(temp.value);// Gia tri cua node hien tai
                temp = temp.next;// thao tac con tro next cua node temp tro toi phan tu tiep theo
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }

    // Ham them node vao dau danh sach
    public static Node addToHead(Node headNode, int value) {
        // Khoi tao mot node can them vao
        Node newNode = new Node(value);
        // Check neu headNode != null tuc la list khong rong thuc hien noi newNode vao
        // headNote
        if (headNode != null) {
            newNode.next = headNode;
        }
        // Con khi headNode == null tuc la list rong thi add newNode vao list
        return newNode;
    }

    // Ham them Node vao cuoi
    public static Node addTotail(Node headNode, int value) {
        // Khoi tao newNode can them vao cuoi list
        Node newNode = new Node(value);
        // check headNote == null thi add newNode vao list
        if (headNode == null) {
            return newNode;
            // Nguoc lai check check lastNode
        } else {
            Node lastNode = headNode; // Khoi tao lastNode = headNode de duyet list tim last note
            while (lastNode.next != null) {// Vong lap tim lastNode neu lastNode.next == null dung vong lap va tra ve
                                           // lastNode
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;// Noi lastNode.next hien tai den NewNode bien newNode thanh lastNode
        }
        return headNode;// headNode la bat bien nen nho lam gi thi lam nho return HeadNodeS
    }

    // Ham them Node theo vi tri index
    public static Node addtoIndex(Node headNode, int value, int index) {
        if (index == 0) {// check list co = 0 hay khong
            return addToHead(headNode, value);// neu list rong thi goi ham addtohead de them node dau tien cua list
        } else {
            Node newNode = new Node(value);// List da co thi khoi tao mot node moi
            Node currNode = headNode;// khoi tao bien currNode de duyet qua list do
            int count = 0;// Ham dem xac dinh vi tri
            while (currNode != null) {// Neu currNode !=null tuc la vong lap se chay va day la buoc de tim vi tri
                                      // index trong list
                count++;// tang bien dem
                currNode = currNode.next;// cho list chay de xac dinh vi tri index
                if (count == index) {// neu count == index tuc la da xac dinh dc index trong list
                    newNode.next = currNode.next;// NewNode se duoc gan = currNode.next vi ta duyet currNode de biet dc
                                                 // vi tri index
                    currNode.next = newNode;// sau do no se tro toi node can them vao
                    break;// thoat
                }

            }
        }
        return headNode;
    }

    // Xoa phan tu dau tien cua List
    public static Node removeAtHead(Node headNode) {
        // check headNode co tro ve null ko
        if (headNode != null) {// neu ma headnode khac null
            return headNode = headNode.next;// thi headnode se duoc tro toi vi tri tiep theo
            // Dieu nay co nghia la node dau tien se bi bo qua va danh sach se tro den vi
            // tri tiep theo
        }
        return headNode;
    }

    // Xoa phan tu cuoi cung cua List
    public static Node removeAtTail(Node headNode) {
        if (headNode == null) {// Check List
            return null;
        }
        Node lastNode = headNode;// Khoi tao bien lastNode de bat dau di xac dinh lastNode
        Node prevNode = null;// Khoi tao mot bien preNode se la bien cuoi cung thay the lastNode
        while (lastNode.next != null) {// Duyet lastNode toi khi no tro den null
            lastNode = lastNode.next;// Trong khoang thoi gian do ta se di chuyen lien tuc lastNode va PrevNode
            prevNode = lastNode;// Khi ket thuc ta se co prevNode = vi tri lastNode-1
        }
        if (prevNode == null) {// Neu prevNode cung tro toi null
            return null;// Tra ve null
        } else {
            prevNode.next = lastNode.next;// Tro prevNode toi null tuc la se remove lastNode
        }
        return headNode;
    }

    // Xoa node o vi tri index bat ky cua list
    public static Node removeAtindex(Node headNode, int index) {
        if (headNode == null || index < 0)// Check list co bang null hay khong
            return null;
        if (index == 0)// neu ma index = 0 tuc la dang muon xoa phan tu dau nen goi lai ham xoa phan tu
                       // dau .
            return removeAtHead(headNode);
        // Khong roi vao 2 truong hop tren thi ta se tim vi tri index
        Node currNode = headNode;// Khoi tao bien node duyet list
        Node prevNode = null;
        int count = 0;// bien dem
        boolean bIsFound = false;// Dieu kien de cuoi ham check
        while (currNode != null) {// Duyet list
            if (count == index) {// Neu ma tim thay vi tri index thi gan bisfound = true va break vong lap
                bIsFound = true;
                break;
            }
            // Con khong thi co vong lap di chuyen va tang bien count ta thay prevNode luon
            // luon di sau currNode
            prevNode = currNode;
            currNode = currNode.next;
            count++;

        }
        if (bIsFound == true) {// Check dieu kien trong vong lap neu = True
            if (prevNode == null) {// Check prev tuc la dang check list co null k
                return null;
            } else {// Khong null thi ta se gan pervNode = currNode.next tuc la bo qua currNode.
                if (currNode != null) {
                    prevNode = currNode.next;
                }
            }
        }

        return headNode;
    }

    public static void main(String[] args) {
        // Tạo danh sách liên kết ban đầu
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;

        // In danh sách liên kết ban đầu
        System.out.println("Initial linked list:");
        printLinkedlist(n1); // Kết quả: 1 -> 2 -> 3

        // Thêm 0 vào đầu danh sách
        n1 = addToHead(n1, 0);
        System.out.println("After adding 0 to head:");
        printLinkedlist(n1); // Kết quả: 0 -> 1 -> 2 -> 3

        // Thêm 4 vào cuối danh sách
        n1 = addTotail(n1, 4);
        System.out.println("After adding 4 to tail:");
        printLinkedlist(n1); // Kết quả: 0 -> 1 -> 2 -> 3 -> 4

        // Thêm 5 tại vị trí 4
        n1 = addtoIndex(n1, 5, 4);
        System.out.println("After adding 5 at index 4:");
        printLinkedlist(n1); // Kết quả: 0 -> 1 -> 2 -> 3 -> 5 -> 4
    }

}
