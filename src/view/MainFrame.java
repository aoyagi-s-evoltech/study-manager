package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {

    public MainFrame() {

        setTitle("学習進捗管理アプリ");
        setSize(800, 600);
        setLocationRelativeTo(null); // ウィンドウを画面の中央に表示する

        createTabs();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createTabs() {

        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("学習記録", createStudyPanel());
        tabbedPane.addTab("集計", createSummaryPanel());
        tabbedPane.addTab("目標管理", createGoalPanel());

        add(tabbedPane);
    }

    private JPanel createStudyPanel() {
        JPanel studyPanel = new JPanel();

        JLabel dateLabel = new JLabel("学習日");

        studyPanel.add(dateLabel);

        return studyPanel;
    }

    private JPanel createSummaryPanel() {
        JPanel summaryPanel = new JPanel();

        JLabel summaryLabel = new JLabel("集計画面");

        summaryPanel.add(summaryLabel);

        return summaryPanel;
    }

        private JPanel createGoalPanel() {
        JPanel goalPanel = new JPanel();

        JLabel goalLabel = new JLabel("目標管理画面");

        goalPanel.add(goalLabel);

        return goalPanel;
    }

}