/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sd;
import java.sql.ResultSet; // import of (ResultSet)
import javax.swing.table.DefaultTableModel; // import of (DefaultTableModel)
/**
 *
 * @author Afif Hossain
 */
public class StudentFrome extends javax.swing.JFrame {

    /**
     * Creates new form StudentFrome
     */
    public StudentFrome() {
        initComponents();
        
        //13 (SearchButton) to work , when we press "Enter" button 
        this.getRootPane().setDefaultButton(SearchButton);
        
        //11.1 To show Student Table -- > Show_Student_Table(); Mathod 
        Show_Student_Table();
        
    }
    //11.2
   private void Show_Student_Table()
   {
        //6 (Student) table er column name gole (Student_Column[]) name e array te set korte hobe 
        String Student_ColumnName[] = {"id" , "name" , "age" , "email" , "dept"};
        
        //7 (JTable = StudentTable) data insert korar jonno (DefaultTableModel)
        // (DefaultTableModel) er jonno import korte hoi 
        // (Student_Model) name 2D array , jar modde protek bar (Student_Column[]) er data insert hobe
        DefaultTableModel Student_Model = new DefaultTableModel(Student_ColumnName, 0); 
        
        //1 database er (student) table er data , query te assign 
        String query = "SELECT * FROM student"; 
        //3 
        try
        {
            // (ResultSet) er jonno import korte hoi 
            // (ResultSet) sob somoi (try catch) block e rakte hoi
            // to get data from database by query
            //2 kuje pele rs e assign korbe
            ResultSet rs = DBUTILS.queryExecute(query);
            
            //4 loop chalanor jonno , student er table data nibe 
            while(rs.next())
            {
                //5 
                String Student_Id = rs.getString("id");
                String Student_Name = rs.getString("name");
                String Student_Age = rs.getString("age");
                String Student_Email = rs.getString("email");
                String Student_Dept = rs.getString("dept");
                
                //8 loop er bitor er data gola (Student_Data[])  name array te assign korte hobe
                String Student_Data[] = {Student_Id , Student_Name , Student_Age , Student_Email , Student_Dept };
                
                //9 (Student_Model) te prottek loop e ekta kore kore row te data add hoi
                Student_Model.addRow(Student_Data);
            }
            //10 Design er (StudentTable) sob set korar jonno
            // (StudentTable) e (Student_Model) array er sob data set hoite takbe
            StudentTable.setModel(Student_Model);
        }
        catch(Exception e)
        {  
        }
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ID_InputField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        Input_NameField = new javax.swing.JTextField();
        Input_AgeField = new javax.swing.JTextField();
        Input_EmailField = new javax.swing.JTextField();
        Input_DeptField = new javax.swing.JTextField();
        InsertButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IIUC University");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Student List");

        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(StudentTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(258, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 46, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        jLabel3.setText("ID : ");

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        Input_AgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_AgeFieldActionPerformed(evt);
            }
        });

        InsertButton.setText("Insert");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Name");

        jLabel5.setText("Age");

        jLabel6.setText("Email");

        jLabel7.setText("Dept.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ID_InputField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchButton))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Input_NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Input_AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Input_EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Input_DeptField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(InsertButton)
                        .addGap(42, 42, 42)
                        .addComponent(UpdateButton)
                        .addGap(41, 41, 41)
                        .addComponent(DeleteButton)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ID_InputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Input_NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input_AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input_EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input_DeptField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertButton)
                    .addComponent(UpdateButton)
                    .addComponent(DeleteButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Input_AgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_AgeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_AgeFieldActionPerformed

    //14 insert button work is done
    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
        // TODO add your handling code here:
        //2 variable assign kora
        String Insert_name = Input_NameField.getText();
        String Insert_age = Input_AgeField.getText(); 
        String Insert_email = Input_EmailField.getText(); 
        String Insert_dept = Input_DeptField.getText(); 
        //1 (StudentTable) e theke query kora
        String query =  "insert into student (name, age, email, dept) values ('"+Insert_name+"' , "+Insert_age+" , '"+Insert_email+"' , '"+Insert_dept+"')";
        
        //4 
        try
        {
            //3 query update korbo DBUTILS class maddome
            int rs = DBUTILS.queryUpdate(query);
        }
        catch(Exception e)
        {
        }
        
        // insert mathod is done , now show the update table
        //5 To show Student Table -- > Show_Student_Table(); Mathod 
        Show_Student_Table();
        
    }//GEN-LAST:event_InsertButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        
        // Here , work will be done by 2 part 
        
        String Insert_name = Input_NameField.getText();
        String Insert_age = Input_AgeField.getText(); 
        String Insert_email = Input_EmailField.getText(); 
        String Insert_dept = Input_DeptField.getText(); 
        
        //1 PART-1 = Search
        // copy of SearchButton work
        String Input_ID = ID_InputField.getText();
        // Update query 
        String query = "update student SET name = '"+Insert_name+"' , age = '"+Insert_age+"' , email = '"+Insert_email+"' , dept = '"+Insert_dept+"' where id = "+Input_ID;
     
        try
        {
            int rs = DBUTILS.queryUpdate(query);
        }
        catch(Exception e)
        {
        }
        Show_Student_Table();
        
        // PART-2 = insert update info
    }//GEN-LAST:event_UpdateButtonActionPerformed

    //12
    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        
        //1 User input dibe
        String Input_ID = ID_InputField.getText();
        
        //2 search korar jonno query code ta likte hobe
        String query = "select *from student where id = "+Input_ID ;
        //4
        try
        {
            //3 (ResultSet) er jonno import korte hoi 
            // (ResultSet) sob somoi (try catch) block e rakte hoi
            // to get data from database by query
            // kuje pele rs e assign korbe
            ResultSet rs = DBUTILS.queryExecute(query);
            
            //5 jodi search data pai 
            if(rs.next())
            {
                // this 8 line converts into 4 line
                //6 text field gola te database theke kuje paowa row er show koranor jonno ei kaj
                /*
                String Student_Input_Name = rs.getString("name");
                String Student_Input_Email = rs.getString("email");
                String Student_Input_Age = rs.getString("age");
                String Student_Input_Dept = rs.getString("dept.");
                
                Input_NameField.setText(Student_Input_Name);
                Input_AgeField.setText(Student_Input_Age);
                Input_EmailField.setText(Student_Input_Email);
                Input_DeptField.setText(Student_Input_Dept);
                */
                
                //6 text field gola te database theke kuje paowa row er show koranor jonno ei kaj
                Input_NameField.setText(rs.getString("name"));
                Input_EmailField.setText(rs.getString("age"));
                Input_AgeField.setText(rs.getString("email"));
                Input_DeptField.setText(rs.getString("dept"));
            }
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        
        //1 User input dibe
        String Input_ID = ID_InputField.getText();
        
        //2 delete korar jonno query code ta likte hobe
        String query = "delete from student where id = "+Input_ID ;
        
        // 3 copy form InsertButton work
        try
        {
            int rs = DBUTILS.queryUpdate(query);
        }
        catch(Exception e)
        {
        }
        Show_Student_Table();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField ID_InputField;
    private javax.swing.JTextField Input_AgeField;
    private javax.swing.JTextField Input_DeptField;
    private javax.swing.JTextField Input_EmailField;
    private javax.swing.JTextField Input_NameField;
    private javax.swing.JButton InsertButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTable StudentTable;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
