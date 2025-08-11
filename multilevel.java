*/
        // multilevel inheritance
       /* class grandparent{
            int x=10;
            void d(){
             System.out.println("grandparent");
            }
        }
        class parent extends grandparent{
            int y=20;
            void d1(){
                System.out.println("parent"+x);
            }
        }
        class child extends parent{
            void d2(){
                System.out.println("child"+y);
            }
        }
        class demo{
            public static void main(String[] args) {
                child c=new child();
                c.d2();
                c.d1();
            }
        }
            */
         //harrypotter example multilevel inheritance
            /*class library{
            String book="HarryPotter";
            void display(){
                System.out.println("libraryclass");
            }
          }  
          class book extends library{
            String paper="magic stick";
            void d(){
            System.out.println(book);
          }
        }
          class paper extends book{
            void d1(){
                System.out.println(paper);
            }
          }
          class demo{
            public static void main(String[] args) {
                paper p=new paper();
                p.d();  
                p.d1();
                p.display();
            }
          }
            
            
