package Java02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class reactionsTest extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton startButton, resetButton;
    private JButton redButton, blueButton, greenButton;
    private JLabel timerLabel, colorLabel, correctLabel, incorrectLabel;
    private Timer timer;
    private int timeRemaining;
    private int correctGuesses;
    private int incorrectGuesses;
    private boolean gameRunning;

    public reactionsTest() {
        setTitle("Reactions Test");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top panel for start and reset buttons
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(topPanel, BorderLayout.NORTH);

        startButton = new JButton("Старт");
        startButton.addActionListener(this);
        topPanel.add(startButton);

        resetButton = new JButton("Започни отново");
        resetButton.addActionListener(this);
        topPanel.add(resetButton);

        // Middle panel for timer and guess labels
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(middlePanel, BorderLayout.CENTER);

        timerLabel = new JLabel("Оставащо време: ");
        middlePanel.add(timerLabel);

        correctLabel = new JLabel("Точни реакции: 0");
        middlePanel.add(correctLabel);

        incorrectLabel = new JLabel("Грешни реакции: 0");
        middlePanel.add(incorrectLabel);

        // Bottom panel for color changing area and buttons
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        add(bottomPanel, BorderLayout.SOUTH);

        colorLabel = new JLabel();
        colorLabel.setOpaque(true);
        colorLabel.setPreferredSize(new Dimension(400, 100));
        colorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bottomPanel.add(colorLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.add(buttonPanel, BorderLayout.SOUTH);

        redButton = new JButton("Червен");
        redButton.addActionListener(this);
        buttonPanel.add(redButton);

        blueButton = new JButton("Син");
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);

        greenButton = new JButton("Зелен");
        greenButton.addActionListener(this);
        buttonPanel.add(greenButton);

        gameRunning = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton && !gameRunning) {
            startGame();
        } else if (e.getSource() == resetButton) {
            resetGame();
        } else if (gameRunning) {
            JButton clickedButton = (JButton) e.getSource();
            Color currentColor = colorLabel.getBackground();

            if (currentColor == Color.RED && clickedButton == redButton ||
                    currentColor == Color.BLUE && clickedButton == blueButton ||
                    currentColor == Color.GREEN && clickedButton == greenButton) {
                correctGuesses++;
            } else {
                incorrectGuesses++;
            }

            updateGuessLabels();

            if (correctGuesses + incorrectGuesses == 30 || timeRemaining == 0) {
                endGame();
            }
        }
    }

    private void startGame() {
        gameRunning = true;
        startButton.setEnabled(false);
        resetButton.setEnabled(true);

        timeRemaining = 60;
        correctGuesses = 0;
        incorrectGuesses = 0;
        updateGuessLabels();

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                timeRemaining--;
                updateTimerLabel();

                if (timeRemaining == 0 || correctGuesses + incorrectGuesses == 30) {
                    endGame();
                } else {
                    changeColor();
                }
            }
        }, 0, 1000); // Timer ticks every second
    }

    private void resetGame() {
        gameRunning = false;
        startButton.setEnabled(true);
        resetButton.setEnabled(false);

        if (timer != null) {
            timer.cancel();
        }

        timeRemaining = 0;
        correctGuesses = 0;
        incorrectGuesses = 0;
        updateTimerLabel();
        updateGuessLabels();
        colorLabel.setBackground(Color.WHITE);
    }

    private void endGame() {
        gameRunning = false;
        startButton.setEnabled(true);
        resetButton.setEnabled(false);

        if (timer != null) {
            timer.cancel();
        }

        JOptionPane.showMessageDialog(this,
                "Тестът приключи!\n" +
                        "Точни реакции: " + correctGuesses + "\n" +
                        "Неточни реакции: " + incorrectGuesses);
    }

    private void changeColor() {
        Random random = new Random();
        int colorIndex = random.nextInt(3);

        switch (colorIndex) {
            case 0:
                colorLabel.setBackground(Color.RED);
                break;
            case 1:
                colorLabel.setBackground(Color.BLUE);
                break;
            case 2:
                colorLabel.setBackground(Color.GREEN);
                break;
        }
    }

    private void updateTimerLabel() {
        timerLabel.setText("Time Remaining: " + timeRemaining + "s");
    }

    private void updateGuessLabels() {
        correctLabel.setText("Correct Guesses: " + correctGuesses);
        incorrectLabel.setText("Incorrect Guesses: " + incorrectGuesses);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            reactionsTest test = new reactionsTest();
            test.setVisible(true);
        });
    }
}