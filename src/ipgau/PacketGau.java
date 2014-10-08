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

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 * IP GAU ���C��
 * @author  ATS
 */
public class PacketGau extends JFrame implements DropTargetListener {

	public static PacketGau frame;
    private static JPanel contentPane;
    private static JEditorPane epMsgView;
    private static JScrollPane mvsp;
    static JTextField tfMessage;
    static JTextField tfAddress;
    private static JButton btnSend;

	private static final int gauWidth = 410;  // �E�B���h�E�����f�t�H���g
	private static final int gauHeight = 310;  // �E�B���h�E�����f�t�H���g
	
	// �\���ʒu
	static int frameX;
	static int frameY;

	
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
    	
        // ���b�Z�[�W�\�����X�N���[���o�[
        mvsp = new JScrollPane(epMsgView);
        mvsp.setBounds(10, 10, 373, 190);

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
        
        // �t���[���i�p�l���j
        contentPane = (JPanel)this.getContentPane();
        contentPane.setLayout(null);
        contentPane.add(mvsp, null);
        contentPane.add(btnSend, null);
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
