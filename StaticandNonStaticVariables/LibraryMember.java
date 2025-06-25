public class LibraryMember {
    int memberId;
    String memberName;
    int booksBorrowed;

    public void borrowBooks(int count) {
        int maxBooksAllowed = 5;

        if (booksBorrowed + count <= maxBooksAllowed) {
            booksBorrowed += count;
            System.out.println(memberName + " borrowed " + count + " book(s). Total borrowed: " + booksBorrowed);
        } else {
            System.out.println(memberName + " cannot borrow " + count + " book(s). Limit exceeded!");
        }
    }

    public void displayMemberInfo() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + memberName);
        System.out.println("Books Borrowed: " + booksBorrowed);
    }

    public static void main(String[] args) {
        LibraryMember member = new LibraryMember();
        member.memberId = 101;
        member.memberName = "John Smith";
        member.booksBorrowed = 2;

        member.displayMemberInfo();
        System.out.println("-----");

        member.borrowBooks(2); 
        member.borrowBooks(2); 
    }
}
