package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import entities.SaleProfessor;

public class ProgramProfessor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre o caminho do arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<SaleProfessor> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				int month = Integer.parseInt(fields[0]);
				int year = Integer.parseInt(fields[1]);
				int items = Integer.parseInt(fields[3]);
				double total = Double.parseDouble(fields[4]);

				list.add(new SaleProfessor(month, year, fields[2], items, total));

				line = br.readLine();
			}

			Map<String, Double> map = new HashMap<>();
			for (SaleProfessor sale : list) {
				map.put(sale.getSeller(), 0.0);
			}

			for (String seller : map.keySet()) {
				double total = list.stream().filter(s -> s.getSeller().equals(seller)).map(s -> s.getTotal())
						.reduce(0.0, (x, y) -> x + y);
				map.put(seller, total);
			}

			System.out.println();
			System.out.println("Total de vendas por vendedor:");
			for (String seller : map.keySet()) {
				System.out.printf(seller + " - R$ %.2f%n", map.get(seller));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();

	}

}
