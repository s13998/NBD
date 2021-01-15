import riak
client = riak.RiakClient()

dokument = {"name": "dokument11", "parzysty":False, "liczba":11, "dodatnia":True}

bucket = client.bucket('s13998')
newDokument = bucket.new(dokument["name"], data=dokument)
newDokument.store()

fetchedDokument = bucket.get(dokument["name"])
print(fetchedDokument.encoded_data)

fetchedDokument.data["liczba"] = 93
fetchedDokument.store()

fetchedDokument = bucket.get(dokument["name"])
print(fetchedDokument.encoded_data)


fetchedDokument.delete()
fetchedDokument = bucket.get(dokument["name"])
print(fetchedDokument.encoded_data)