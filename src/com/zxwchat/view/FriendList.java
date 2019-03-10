package com.zxwchat.view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class FriendList extends JFrame implements ActionListener,MouseListener{//��������
 CardLayout cardLayout;//��Ƭ����
 //�����������ñ���
 JPanel myFriendPanel;
 JButton myFriendJButton;
 
 JScrollPane myFriendJScrollPane;//�ҵĺ��ѿ�Ƭ
 JPanel myFriendListJPanel;
 static final int FRIENDCOUNT=51;
 JLabel[] myFriendJLabel=new JLabel[FRIENDCOUNT];//�������飿
 //myfriendJLable[0]...myfirendJLable[50]ÿһ���������ñ���
 
 JScrollPane myStrangerJScrollPane;//�ҵ�İ���˿�Ƭ
 JPanel myStrangerListJPanel;
 static final int STRANGERCOUNT=51;
 JLabel[] myStrangerJLabel=new JLabel[STRANGERCOUNT];//�������飿
 //myfriendJLable[0]...myfirendJLable[50]ÿһ���������ñ���
 
 
 JPanel myStrangerBlackListJPanel;
 JButton myStrangerJButton;
 JButton blackListJButton;
 
 JPanel myStrangerPanel;
 JPanel myFriendStrangerPanel;
 JButton myFriendJButton1;
 JButton myStrangerJButton1;
 JButton blackListJButton1;
 
 public FriendList(){
  //��һ�ſ�Ƭ,��������
  myFriendPanel=new JPanel(new BorderLayout());//�߽粼��
  //System.out.println(myFriendpanel.getLayout());
  myFriendJButton=new JButton("�ҵĺ���");
  myFriendPanel.add(myFriendJButton,"North");
    
  myFriendListJPanel=new JPanel(new GridLayout(FRIENDCOUNT-1,1));
  for(int i=1;i<FRIENDCOUNT;i++){
	  myFriendJLabel[i]=new JLabel(i+"",new  ImageIcon("images/qq.gif"),JLabel.LEFT);//"1"
	  myFriendJLabel[i].addMouseListener(this);//�����������
	  myFriendListJPanel.add(myFriendJLabel[i]); 
	  //�в�
  }
  myFriendJScrollPane =new JScrollPane(myFriendListJPanel);
  myFriendPanel.add(myFriendJScrollPane);
  
  myStrangerBlackListJPanel=new JPanel(new GridLayout(2,1));//���粼��
  myStrangerJButton=new JButton("�ҵ�İ����");
  //����¼�������
  myStrangerJButton.addActionListener(this);
  
  blackListJButton=new JButton("������");
  myStrangerBlackListJPanel.add(myStrangerJButton);
  myStrangerBlackListJPanel.add(blackListJButton);
  myFriendPanel.add(myStrangerBlackListJPanel,"South");
    
  //��һ�ſ�Ƭ  
  myStrangerPanel =new JPanel(new BorderLayout());
  
  myFriendStrangerPanel=new JPanel(new GridLayout(2,1));
  myFriendJButton1=new JButton("�ҵĺ���");//��Ӽ�����
     myFriendJButton1.addActionListener(this);
     myStrangerJButton1=new JButton("�ҵ�İ����");
     myFriendStrangerPanel.add(myFriendJButton1);
     myFriendStrangerPanel.add(myStrangerJButton1);
     myStrangerPanel.add(myFriendStrangerPanel,"North");
     
     blackListJButton1=new JButton("������");
     myStrangerPanel.add(blackListJButton1,"South");
    //xx xxxxxxxxxxxxx
     myStrangerListJPanel=new JPanel(new GridLayout(STRANGERCOUNT-1,1));
     for(int i=1;i<FRIENDCOUNT;i++){
   	  myStrangerJLabel[i]=new JLabel(i+"",new  ImageIcon("images/qq.gif"),JLabel.LEFT);//"1"
   	  myStrangerJLabel[i].addMouseListener(this);//�����������
   	  myStrangerListJPanel.add(myStrangerJLabel[i]); 
     }
     myStrangerJScrollPane =new JScrollPane(myStrangerListJPanel);
     myStrangerPanel.add(myStrangerJScrollPane);
    //xx xxxxxxxxxxxx
     cardLayout=new CardLayout();
     this.setLayout(cardLayout);
     this.add(myFriendPanel,"1");
     this.add(myStrangerPanel,"2");
     
     this.setSize(150,500);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setVisible(true);
  } 

 
 public static void main(String[] arg0) {
  FriendList friendList=new FriendList();
 
 }
 @Override
 public void actionPerformed(ActionEvent arg0){
  if(arg0.getSource()==myStrangerJButton){
   cardLayout.show(this.getContentPane(),"2");
  }
  if(arg0.getSource()==myFriendJButton1){
   cardLayout.show(this.getContentPane(),"1");
  }
 }
 
@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
	
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	JLabel jLabel=(JLabel)arg0.getSource();
	jLabel.setForeground(Color.red);
	
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	JLabel jLabel=(JLabel)arg0.getSource();
	jLabel.setForeground(Color.black);
	
}

@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
}