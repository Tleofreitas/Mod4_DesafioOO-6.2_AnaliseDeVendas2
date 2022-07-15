package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import javax.print.DocFlavor.STRING;

import entities.Sale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Entrar com caminho da pasta
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		// C:\Users\Thiago Freitas\Desktop\in.csv

		// Abrir o arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Sale> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2],
						Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
				line = br.readLine();
			}

			System.out.println("---Lista de Vendedores -------------");
			HashSet<String> list2 = new HashSet<String>();

			for (Sale vendedores : list) {
				list2.add(vendedores.getSeller());
			}

			for (String vendedores : list2) {
				System.out.println(vendedores);
			}

			System.out.println("---Total de Vendas por Vendedor-----");
			HashMap<String, Double> list3 = new HashMap<>();
			
			Double totalPorVendedor;
			
			for (String vendedores : list2) {
				totalPorVendedor = list.stream().filter(v -> v.getSeller().equals(vendedores))
						.map(v -> v.getTotal())
						.reduce(0.0, (x, y) -> x + y);
				list3.put(vendedores, totalPorVendedor);
			}
			
			// Percorrer e imprimir chave valor
			for (Entry<String, Double> vendedor : list3.entrySet()) {
				System.out.print(vendedor.getKey() + " - R$ ");
				System.out.println(String.format("%.2f", vendedor.getValue()));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
