package ru.mera.romazanova.task3;

public class MailBox {

    static private final int INCREMENT = 4;
    private EmailMessage [] emailMessageBox = new EmailMessage [INCREMENT] ;
        private PaperMessage [] paperMessageBox = new PaperMessage [INCREMENT];
        private int nextEmailPosition = 0;
        private int nextPaperPosition = 0;

        public void addEmailMessageToBox (EmailMessage msg){
            if (nextEmailPosition == emailMessageBox.length ){
                increaseEmailBoxSize();	
            }
            emailMessageBox [nextEmailPosition] = msg;
            nextEmailPosition++;
        }

        private void increaseEmailBoxSize() {
            EmailMessage [] tmp = new EmailMessage [emailMessageBox.length + INCREMENT] ;

            System.arraycopy (emailMessageBox, 0, tmp,	0, emailMessageBox.length);
            emailMessageBox = tmp;
        }

        public void addPaperMessageToBox (PaperMessage msg){
            if (nextPaperPosition >= paperMessageBox.length ){
                increasePaperMessageBoxSize();	
            }
            paperMessageBox [nextPaperPosition] = msg;
            nextPaperPosition++;
        }	
        private void increasePaperMessageBoxSize() {
            PaperMessage [] tmp = new PaperMessage [paperMessageBox.length + INCREMENT] ;

            System.arraycopy (paperMessageBox, 0, tmp,	0, paperMessageBox.length);
            paperMessageBox = tmp;
        }
        public void printAllEmailMessages (){
            for (int i = 0; i < emailMessageBox.length; i++ ){
                System.out.println(emailMessageBox [i]);
            }
        }
        public void printAllPaperMessages (){
            for (int i = 0; i < paperMessageBox.length; i++ ){
                System.out.println(paperMessageBox [i]);
            }
        }
}


