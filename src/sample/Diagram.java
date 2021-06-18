package sample;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class Diagram extends ApplicationFrame {

    public Diagram(String applicationTitle, String chartTitle) {
        super(applicationTitle);
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                "Категория",
                "Очки",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        int width = 960;
        int height = 540;

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(width, height));
        setContentPane(chartPanel);
    }

    public static void PROG() {
        Diagram chart = new Diagram("Семейство Джостаров",
                "Сравнение представителей семейства Джостаров");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }

    private CategoryDataset createDataset() {
        final String JoJo1 = "Джонатан Джостар";
        final String JoJo2 = "Джозеф Джостер";
        final String JoJo3 = "Джотаро Куджо";
        final String JoJo4 = "Джоске Хигашиката";
        final Double JoJo1charisma = 6.0;
        final Double JoJo1strength = 4.0;
        final Double JoJo1popularity = 6.0;
        final Double JoJo1height = 1.95;
        final Double JoJo1weight = 10.5;
        final Double JoJo2charisma = 6.0;
        final Double JoJo2strength = 8.0;
        final Double JoJo2popularity = 7.0;
        final Double JoJo2height = 7.5;
        final Double JoJo2weight = 9.7;
        final Double JoJo3charisma = 6.0;
        final Double JoJo3strength = 9.5;
        final Double JoJo3popularity = 8.5;
        final Double JoJo3height = 1.95;
        final Double JoJo3weight = 8.2;
        final Double JoJo4charisma = 6.0;
        final Double JoJo4strength = 8.0;
        final Double JoJo4popularity = 7.0;
        final Double JoJo4height = 1.85;
        final Double JoJo4weight = 8.2;
        final String charisma = "Харизма";
        final String strength = "Сила";
        final String popularity = "Популярность";
        final String height = "Рост / м";
        final String weight = "Вес / 1 * 10 кг";
        final DefaultCategoryDataset dataset =
                new DefaultCategoryDataset();

        dataset.addValue(JoJo1charisma, JoJo1, charisma);
        dataset.addValue(JoJo1strength, JoJo1, strength);
        dataset.addValue(JoJo1popularity, JoJo1, popularity);
        dataset.addValue(JoJo1height, JoJo1, height);
        dataset.addValue(JoJo1weight, JoJo1, weight);

        dataset.addValue(JoJo2charisma, JoJo2, charisma);
        dataset.addValue(JoJo2strength, JoJo2, strength);
        dataset.addValue(JoJo2popularity, JoJo2, popularity);
        dataset.addValue(JoJo2height, JoJo2, height);
        dataset.addValue(JoJo2weight, JoJo2, weight);

        dataset.addValue(JoJo3charisma, JoJo3, charisma);
        dataset.addValue(JoJo3strength, JoJo3, strength);
        dataset.addValue(JoJo3popularity, JoJo3, popularity);
        dataset.addValue(JoJo3height, JoJo3, height);
        dataset.addValue(JoJo3weight, JoJo3, weight);

        dataset.addValue(JoJo4charisma, JoJo4, charisma);
        dataset.addValue(JoJo4strength, JoJo4, strength);
        dataset.addValue(JoJo4popularity, JoJo4, popularity);
        dataset.addValue(JoJo4height, JoJo4, height);
        dataset.addValue(JoJo4weight, JoJo4, weight);

        return dataset;
    }

}