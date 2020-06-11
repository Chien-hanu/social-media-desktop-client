package edu.hanu.social_media_desktop_client.gui;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import edu.hanu.social_media_desktop_client.utils.PlaceHolderTextField;

public class EditProfileGUI extends Frame {

	private static final long serialVersionUID = 1L;
	// nav-bar
	private JButton btnHome;
	private JButton btnProfile;
	private JButton btnMesssage;
	private PlaceHolderTextField textSearch;
	private JButton btnSearch;
	private JButton btnLogout;

	// end nav-bar
	public EditProfileGUI() {
		// TODO Auto-generated constructor stub
		super("Edit Profile");
		setSize(400, 600);
		setLocation(500, 100);
		setLayout(null);
		initPanels();
	}

	private void initPanels() {
		// TODO Auto-generated method stub
		// nav-bar
		btnHome = new JButton("Home");
		btnHome.setSize(100, 40);
		btnHome.setLocation(0, 0);
		btnHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				HomePageGUI homePageGUI = new HomePageGUI();
				homePageGUI.setVisible(true);
			}
		});
		add(btnHome);

		btnProfile = new JButton("Profile");
		btnProfile.setSize(100, 40);
		btnProfile.setLocation(100, 0);
		btnProfile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ProfileGUI profileGUI = new ProfileGUI();
				profileGUI.setVisible(true);
			}
		});

		add(btnProfile);

		btnMesssage = new JButton("Message");
		btnMesssage.setSize(100, 40);
		btnMesssage.setLocation(200, 0);
		btnMesssage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MessageGUI messageGUI = new MessageGUI();
				messageGUI.setVisible(true);
			}
		});
		add(btnMesssage);

		btnLogout = new JButton("Log out");
		btnLogout.setSize(100, 40);
		btnLogout.setLocation(300, 0);
		btnLogout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				LoginGUI loginGUI = new LoginGUI();
				loginGUI.setVisible(true);
			}
		});
		add(btnLogout);

		textSearch = new PlaceHolderTextField(30);
		textSearch.setPlaceholder("Search people");
		textSearch.setSize(265, 40);
		textSearch.setLocation(0, 40);
		add(textSearch);

		btnSearch = new JButton("Search");
		btnSearch.setSize(130, 40);
		btnSearch.setLocation(260, 39);
		add(btnSearch);
		// nav-bar end
	}

	public static void main(String[] args) {
		EditProfileGUI editProfileGUI = new EditProfileGUI();
		editProfileGUI.setVisible(true);
	}
}
