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
 * IP GAU メイン
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

	private static final int gauWidth = 410;  // ウィンドウ横幅デフォルト
	private static final int gauHeight = 310;  // ウィンドウ高さデフォルト
	
	// 表示位置
	static int frameX;
	static int frameY;

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        frame = new PacketGau();
        frame.setSize(gauWidth, gauHeight);

        frame.setTitle("IP GAU");

        // 画面表示位置設定
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frameX = (screenSize.width - gauWidth) / 2;
        frameY = (screenSize.height - gauHeight) / 2;
        
        frame.setLocation(frameX,frameY);


        // GUI(フレーム)表示
        frame.setVisible(true);
		
	}
	
    /**
     * コンストラクタ。
     */
    public PacketGau() {
    	//初期化処理
    	initGau();
    }
    /**
     * 初期化処理
     */
    private void initGau() {
    	
        // メッセージ表示欄スクロールバー
        mvsp = new JScrollPane(epMsgView);
        mvsp.setBounds(10, 10, 373, 190);

        // 送信ボタン
        btnSend = new JButton("送信");
        btnSend.setBounds(333, 207, 48, 24);
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // buttonSend();
            	System.out.println("そうしん！");
            }
        });
        btnSend.setToolTipText("送信ボタン");
        
        // フレーム（パネル）
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
