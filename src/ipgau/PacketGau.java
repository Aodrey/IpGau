/**
 * Project GAU cooperates with ATS Ltd.
 * Copyright (C) 2004-2012 ATS,Ltd., All rights Reserved.
 */
package ipgau;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.html.HTMLDocument;

/**
 * IP GAU ���C��
 * @author  ATS
 */
public class PacketGau extends JFrame implements DropTargetListener {

	private static PacketGau frame;
    private static JPanel contentPane;
    private static JEditorPane epMsgView;
    private static JScrollPane mvsp;
    private static JTextField tfMessage;
    private static JTextField tfAddress;
    private static JButton btnSend;
    private static JButton btnAddress;

	private static final int gauWidth = 410;  // �E�B���h�E�����f�t�H���g
	private static final int gauHeight = 320;  // �E�B���h�E�����f�t�H���g
	
	// �\���ʒu
	private static int frameX;
	private static int frameY;
	
	private static String host_nm;

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        frame = new PacketGau();
        frame.setSize(gauWidth, gauHeight);

        frame.setTitle("IP GAU");

        // ��ʕ\���ʒu�ݒ�
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frameX = (screenSize.width - gauWidth) / 2;
        frameY = (screenSize.height - gauHeight) / 2;
        
        frame.setLocation(frameX,frameY);

        tfAddress.setText(host_nm);  // ���M��z�X�g���Z�b�g
        // GUI(�t���[��)�\��
        frame.setVisible(true);
		
	}
	
    /**
     * �R���X�g���N�^�B
     */
    public PacketGau() {
    	//����������
    	initGau();
    }
    /**
     * ����������
     */
    private void initGau() {

        // �ݒ�t�@�C���f�t�H���g�Z�b�g
        host_nm = "192.168.0.5";

        // ���b�Z�[�W�\����
        epMsgView = new JEditorPane("text/html","");
        epMsgView.setDocument(new HTMLDocument());
        epMsgView.setEditable(false);
        
        // ���b�Z�[�W�\�����X�N���[���o�[
        mvsp = new JScrollPane(epMsgView);
        mvsp.setBounds(10, 10, 373, 190);

        // ���b�Z�[�W���͗�
        tfMessage = new JTextField("");
        tfMessage.setBounds(36, 208, 295, 22);

        // ������͗�
        tfAddress = new JTextField("");
        tfAddress.setBounds(36, 238, 295, 22);
        
        // ���M�{�^��
        btnSend = new JButton("���M");
        btnSend.setBounds(333, 207, 48, 24);
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // buttonSend();
            	System.out.println("��������I");
            }
        });
        btnSend.setToolTipText("���M�{�^��");
        
        // �N��������I���{�^��
        btnAddress = new JButton();
        btnAddress.setBounds(10, 237, 24, 24);
        btnAddress.setToolTipText("����ύX");
        btnAddress.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
			        JList jl = null;
			        JTextArea ta = null;
			        JComboBox cb = null;
			        JScrollPane sc = null;

			        Object[] ret = null;
			        Object ob = null;
			        Object[] btn = {"�͂�","������"};
			        int dicon = JOptionPane.PLAIN_MESSAGE;

			        // ���x��
			        JLabel lb = new JLabel("aiueo");

		            // �Ƃ肠�������x���̂�
	                btn = new Object[1];
	                btn[0] = "����";
		            dicon = JOptionPane.INFORMATION_MESSAGE;
		            

			        Object[] obj = {lb,ob};
			        int ans = JOptionPane.showOptionDialog(frame,obj,"�����Ƃ�",JOptionPane.OK_CANCEL_OPTION,dicon,null,btn,null);

			        if (ans == 0) {

		                Object[] wk_obj = {"yes"};
		                ret = wk_obj;
		                
			        } else if (ans == 2) {

			        } else if (ans == 3) {

			        }

			}
        	
        });
        
        // �t���[���i�p�l���j
        contentPane = (JPanel)this.getContentPane();
        contentPane.setLayout(null);
        contentPane.add(mvsp, null);
        contentPane.add(tfMessage, null);
        contentPane.add(tfAddress, null);
        contentPane.add(btnSend, null);
        contentPane.add(btnAddress, null);
    }

	/* (non-Javadoc)
	 * @see java.awt.dnd.DropTargetListener#dragEnter(java.awt.dnd.DropTargetDragEvent)
	 */
	@Override
	public void dragEnter(DropTargetDragEvent arg0) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.awt.dnd.DropTargetListener#dragExit(java.awt.dnd.DropTargetEvent)
	 */
	@Override
	public void dragExit(DropTargetEvent arg0) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.awt.dnd.DropTargetListener#dragOver(java.awt.dnd.DropTargetDragEvent)
	 */
	@Override
	public void dragOver(DropTargetDragEvent arg0) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.awt.dnd.DropTargetListener#drop(java.awt.dnd.DropTargetDropEvent)
	 */
	@Override
	public void drop(DropTargetDropEvent arg0) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.awt.dnd.DropTargetListener#dropActionChanged(java.awt.dnd.DropTargetDragEvent)
	 */
	@Override
	public void dropActionChanged(DropTargetDragEvent arg0) {
		// TODO Auto-generated method stub

	}

}
