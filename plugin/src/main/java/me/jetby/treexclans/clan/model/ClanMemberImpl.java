package me.jetby.treexclans.clan.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.jetby.treexclans.api.service.clan.member.Member;
import me.jetby.treexclans.api.service.clan.member.rank.Rank;
import org.bukkit.Color;

import java.util.Map;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class ClanMemberImpl implements Member {
    private UUID uuid;
    private Rank rank;
    private long joinedAt;
    private long lastOnline;
    private boolean clanGlow;
    private boolean chat;
    private int coin;
    private int exp;
    private Map<UUID, Color> glowColors;
    private int kills;
    private int deaths;

    public void addCoin(int a) {
        coin = coin + a;
    }

    public void takeCoin(int a) {
        coin = coin - a;
    }
}
