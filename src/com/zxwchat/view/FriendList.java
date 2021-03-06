package com.zxwchat.view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class FriendList extends JFrame implements ActionListener,MouseListener{//顶层容器
 CardLayout cardLayout;//卡片布局
 //定义对象的引用变量
 JPanel myFriendPanel;
 JButton myFriendJButton;
 
 JScrollPane myFriendJScrollPane;//我的好友卡片
 JPanel myFriendListJPanel;
 static final int FRIENDCOUNT=51;
 JLabel[] myFriendJLabel=new JLabel[FRIENDCOUNT];//对象数组？
 //myfriendJLable[0]...myfirendJLable[50]每一个都是引用变量
 
 JScrollPane myStrangerJScrollPane;//我的陌生人卡片
 JPanel myStrangerListJPanel;
 static final int STRANGERCOUNT=51;
 JLabel[] myStrangerJLabel=new JLabel[STRANGERCOUNT];//对象数组？
 //myfriendJLable[0]...myfirendJLable[50]每一个都是引用变量
 
 
 JPanel myStrangerBlackListJPanel;
 JButton myStrangerJButton;
 JButton blackListJButton;
 
 JPanel myStrangerPanel;
 JPanel myFriendStrangerPanel;
 JButton myFriendJButton1;
 JButton myStrangerJButton1;
 JButton blackListJButton1;
 
 public FriendList(){
  //第一张卡片,创建对象
  myFriendPanel=new JPanel(new BorderLayout());//边界布局
  //System.out.println(myFriendpanel.getLayout());
  myFriendJButton=new JButton("我的好友");
  myFriendPanel.add(myFriendJButton,"North");
    
  myFriendListJPanel=new JPanel(new GridLayout(FRIENDCOUNT-1,1));
  for(int i=1;i<FRIENDCOUNT;i++){
	  myFriendJLabel[i]=new JLabel(i+"",new  ImageIcon("images/qq.gif"),JLabel.LEFT);//"1"
	  myFriendJLabel[i].addMouseListener(this);//添加鼠标监听器
	  myFriendListJPanel.add(myFriendJLabel[i]); 
	  //中部
  }
  myFriendJScrollPane =new JScrollPane(myFriendListJPanel);
  myFriendPanel.add(myFriendJScrollPane);
  
  myStrangerBlackListJPanel=new JPanel(new GridLayout(2,1));//网络布局
  myStrangerJButton=new JButton("我的陌生人");
  //添加事件监听器
  myStrangerJButton.addActionListener(this);
  
  blackListJButton=new JButton("黑名单");
  myStrangerBlackListJPanel.add(myStrangerJButton);
  myStrangerBlackListJPanel.add(blackListJButton);
  myFriendPanel.add(myStrangerBlackListJPanel,"South");
    
  //另一张卡片  
  myStrangerPanel =new JPanel(new BorderLayout());
  
  myFriendStrangerPanel=new JPanel(new GridLayout(2,1));
  myFriendJButton1=new JButton("我的好友");//添加监听器
     myFriendJButton1.addActionListener(this);
     myStrangerJButton1=new JButton("我的陌生人");
     myFriendStrangerPanel.add(myFriendJButton1);
     myFriendStrangerPanel.add(myStrangerJButton1);
     myStrangerPanel.add(myFriendStrangerPanel,"North");
     
     blackListJButton1=new JButton("黑名单");
     myStrangerPanel.add(blackListJButton1,"South");
    //xx xxxxxxxxxxxxx
     myStrangerListJPanel=new JPanel(new GridLayout(STRANGERCOUNT-1,1));
     for(int i=1;i<FRIENDCOUNT;i++){
   	  myStrangerJLabel[i]=new JLabel(i+"",new  ImageIcon("images/qq.gif"),JLabel.LEFT);//"1"
   	  myStrangerJLabel[i].addMouseListener(this);//添加鼠标监听器
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