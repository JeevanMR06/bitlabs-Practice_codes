//WAP to print all alphabets from a to z. - using while loop
class AtoZ {
    public static void main(String[] args) {
      char ch = 'a';
      while(ch>=97 && ch<=122)
        {
          System.out.println(ch);
          ch++;
        }
    }
}