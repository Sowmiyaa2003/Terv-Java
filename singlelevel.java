//single inheritance
       /* class parent{
            int x=10;
            void parentMethod(){
                System.out.println("parent");
            }
        }
        class child extends parent{
            void childMethod(){
                System.out.println("child");
            }
        }
        class demo{
           public static void main(String[] args) {
                child c=new child();
                c.childMethod();
                c.parentMethod();
            }
        }
            */
            //single inheritance example
           /* class library{
                String book="Hitler the war";
                String article="beauty and beast";
                String newspaper ="The Hindu";
                void display(){
                    System.out.println("Libraryclass");
                }
            }
            class bookName extends library {
                void dd(){
                      System.out.println(""+book);
            }
        }
        class article extends library {
                void dd2(){
                      System.out.println(""+article);
            }
        }
        class newspaper extends library {
                void dd3(){
                      System.out.println(""+newspaper);
            }
        }
        class demo{
            public static void main(String[] args) {
                bookName b=new bookName();
b.dd();
article a=new article();
a.dd2();
newspaper n=new newspaper();
n.dd3();
            }
        }
        
