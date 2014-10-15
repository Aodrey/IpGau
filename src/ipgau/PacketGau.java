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
 * IP GAU メイン
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

	private static final int gauWidth = 410;  // ウィンドウ横幅デフォルト
	private static final int gauHeight = 320;  // ウィンドウ高さデフォルト
	
	// 表示位置
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

        // 画面表示位置設定
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frameX = (screenSize.width - gauWidth) / 2;
        frameY = (screenSize.height - gauHeight) / 2;
        
        frame.setLocation(frameX,frameY);

        tfAddress.setText(host_nm);  // 送信先ホスト名セット
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

        // 設定ファイルデフォルトセット
        host_nm = "192.168.0.5";

        // メッセージ表示欄
        epMsgView = new JEditorPane("text/html","");
        epMsgView.setDocument(new HTMLDocument());
        epMsgView.setEditable(false);
        
        // メッセージ表示欄スクロールバー
        mvsp = new JScrollPane(epMsgView);
        mvsp.setBounds(10, 10, 373, 190);

        // メッセージ入力欄
        tfMessage = new JTextField("");
        tfMessage.setBounds(36, 208, 295, 22);

        // 宛先入力欄
        tfAddress = new JTextField("");
        tfAddress.setBounds(36, 238, 295, 22);
        
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
        
        // 起動中宛先選択ボタン
        btnAddress = new JButton();
        btnAddress.setBounds(10, 237, 24, 24);
        btnAddress.setToolTipText("宛先変更");
        btnAddress.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
			        JList jl = null;
			        JTextArea ta = null;
			        JComboBox cb = null;
			        JScrollPane sc = null;

			        Object[] ret = null;
			        Object ob = null;
			        Object[] btn = {"はい","いいえ"};
			        int dicon = JOptionPane.PLAIN_MESSAGE;

			        // ラベル
			        JLabel lb = new JLabel("aiueo");

		            // とりあえずラベルのみ
	                btn = new Object[1];
	                btn[0] = "閉じる";
		            dicon = JOptionPane.INFORMATION_MESSAGE;
		            

			        Object[] obj = {lb,ob};
			        int ans = JOptionPane.showOptionDialog(frame,obj,"たいとる",JOptionPane.OK_CANCEL_OPTION,dicon,null,btn,null);

			        if (ans == 0) {

		                Object[] wk_obj = {"yes"};
		                ret = wk_obj;
		                
			        } else if (ans == 2) {

			        } else if (ans == 3) {

			        }

			}
        	
        });
        
        // フレーム（パネル）
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
