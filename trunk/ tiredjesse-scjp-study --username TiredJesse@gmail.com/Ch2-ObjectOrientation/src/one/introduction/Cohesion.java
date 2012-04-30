package one.introduction;

import java.util.List;
import java.util.Map;

public class Cohesion {}

// Cohesion is the degree in which a class has a single, well defined
// role and responsibility. This instance is a HAS-A relationship.

// High Cohesion is a desirable state in which a class has members to support
// a single, well focused role.

// Low Cohesion is an undesirable state in which a class has members to support
// multiple unfocused roles.

// IE:
// Highly cohesive Team class. A team HAS-A name, a roster of players and sometimes
// more than one coach. The focus is clear, this is describing a list of players and coaches
@SuppressWarnings("unused")
class CohesiveTeam {
	private String name;
	private List<Player> roster;
	private List<Coach> coaches;
}

// Low Cohesive Team class. The members have different responsibilities.
// There's no clear focus on what the class is doing.
// The class describes a list of players and coaches as well as 
// people's wallets, pets and each player's homework.
@SuppressWarnings("unused")
class UncohesiveTeam {
	private String name;
	private List<Player> roster;
	private List<Coach> coaches;
	private Map<Person, Wallet> wallets;
	private Map<Person, Pet> pets;
	private Map<Player, Homework> playersHomework;
}

class Person {}
class Player extends Person {}
class Coach extends Person {}
class Wallet {}
class Pet {}
class Homework {}