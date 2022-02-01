create view remboursementPret as 
	select pr.id,pr.dateLimite,(pr.montant-(select sum(montant) from detailPret as r where r.idPret=pr.id))*(0.01*(select confiance from confiance c where c.id=pr.id)) as rembour 
	from Pret as pr join Mpiangona p on pr.idMpiangona=p.id 


create view confiance as select sum(plus) as confiance,p.id from pret p left join confiancePlus c on c.idPret=p.id group by p.id

create view remboursementDetailPret as 
	select dp.idPret as id,dp.date,(dp.montant*0.01*(select confiance from confiance c where c.id=p.id)) as rembour 
	from detailPret  dp join pret p on p.id=dp.idPret join Remboursement r on r.idPret=p.id where dp.montant!=r.montant and dp.date!=r.date
