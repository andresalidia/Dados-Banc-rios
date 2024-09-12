/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package createtextfile;

import createtextfile.CreateTextFile;

    public class CreateTextFileTest
    {
        public static void main( String[] args )
        {
            CreateTextFile application = new CreateTextFile();
            application.openFile();
            application.addRecords();
            application.closeFile();
        } // fim de main
    } // fim da classe CreateTextFileTest