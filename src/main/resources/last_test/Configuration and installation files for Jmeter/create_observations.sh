pathUrl=$1
token=$2
patienId=$3
start_date=$4
end_date=$5

python3 /home/fernand/last-test/getemed/test/venv/bin/create_observations.py --base_url $pathUrl --dc_token $token --patientid1 $patienId --start_date $start_date --end_date $end_date
