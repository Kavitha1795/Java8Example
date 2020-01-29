package com.accenture.streamexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapandFlatMapExample {

	public static void main(String[] args) {

		List<Player> teamIndia = Arrays.asList(new Player("virat", 27, "India"), 
				new Player("Rohit", 27, "India"));

		List<Player> teamAustrlia = Arrays.asList(new Player("smith", 32, "Austrila"),
				new Player("Pointing", 34, "Austrila"));

		List<List<Player>> allTeamsList = Arrays.asList(teamIndia, teamAustrlia);

		List<String> allPlayersNames = new ArrayList<>();
	
		allPlayersNames = allTeamsList.stream().
				flatMap(allTeamsList1 -> allTeamsList1.stream()).
				map(s -> s.getName())
				.collect(Collectors.toList());

		System.out.println(allPlayersNames);

	}
}
